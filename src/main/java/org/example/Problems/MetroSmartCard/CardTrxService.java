package org.example.Problems.MetroSmartCard;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CardTrxService {

    private InMemoryCardTrxRepository repository = new InMemoryCardTrxRepository();
    private ConcurrentMap<Stations, AtomicInteger> stationFootFall = new ConcurrentHashMap<>();
    private FareCalculator fareCalculator = new FareCalculator();


    public void swipeIn(SmartCard card, Stations stations, LocalDateTime localDateTime) {
        if (card.getBalance() < 5.5) {
            throw new InsufficientCardBalance("Mini bal should be 5.5");
        }
        stationFootFall.putIfAbsent(stations, new AtomicInteger());
        int i = stationFootFall.get(stations).incrementAndGet();
        CardTrx trx = new CardTrx();
        trx.setSource(stations);
        trx.setSmartCard(card);
        trx.setStartTime(localDateTime);

        repository.addTransientTrx(card, trx);

    }

    public void swipeOut(SmartCard card, Stations destination, LocalDateTime localDateTime) {

        stationFootFall.putIfAbsent(destination, new AtomicInteger());
        stationFootFall.get(destination).incrementAndGet();
        CardTrx trx = repository.getTransientTrx(card);
        trx.setEndTime(localDateTime);
        trx.setDestination(destination);
        trx.setFare(fareCalculator.getFare(trx.getSource(), destination, localDateTime));
        trx.setDistance(destination.getDistance(trx.source));
        if (trx.getFare() > card.getBalance()) {
            throw new InsufficientCardBalance("Insufficient balance at Swipe Out, Please recharge card and try again");
        }
        trx.setFareStrategy(FareFactory.getFareInstance(localDateTime));
        trx.setBalance(card.getBalance() - trx.getFare());
        card.setBalance(card.getBalance() - trx.getFare());
        repository.addCompleteTrx(card,trx);


    }

    public List<CardTrx> cardReport(SmartCard card) {
        List<CardTrx> trxs = repository.getCompletedTrxs(card);
        trxs.forEach(trx -> {
            System.out.println("trx = " + trx);
        });
        return trxs;
    }


    public int calculateFootFall(Stations stations) {
        return stationFootFall.getOrDefault(stations, new AtomicInteger(0)).get();
    }

}
