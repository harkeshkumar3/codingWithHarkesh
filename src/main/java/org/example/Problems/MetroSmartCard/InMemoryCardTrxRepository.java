package org.example.Problems.MetroSmartCard;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class InMemoryCardTrxRepository {

    ConcurrentMap<SmartCard, CardTrx> transientTrxStore = new ConcurrentHashMap<>();
    private ConcurrentMap<SmartCard, List<CardTrx>> completedTrxStore = new ConcurrentHashMap<>();


    public void addCompleteTrx(SmartCard smartCard, CardTrx trx) {

        completedTrxStore.putIfAbsent(smartCard, new ArrayList<>());
        completedTrxStore.get(smartCard).add(trx);
    }

    public void addTransientTrx(SmartCard card, CardTrx trx) {
        transientTrxStore.put(card, trx);
    }

    public CardTrx getTransientTrx(SmartCard smartCard) {
      return   transientTrxStore.remove(smartCard);
    }
    public List<CardTrx> getCompletedTrxs(SmartCard card) {
        return completedTrxStore.getOrDefault(card, Collections.emptyList());
    }

}
