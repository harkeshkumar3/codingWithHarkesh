//package org.example.Problems.MetroSmartCard;
//
//import org.hamcrest.CustomMatcher;
//import org.junit.Before;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;
//
//import java.time.LocalDateTime;
//import java.time.Month;
//import java.util.List;
//
////import static org.hamcrest.Matchers.equalTo;
////import static org.hamcrest.Matchers.hasItemInArray;
//import static org.junit.Assert.assertThat;
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//public class MetroServiceTest {
//
//    private CardTrxService metroService = new CardTrxService();
//
//    private SmartCard card;
//
//    @BeforeAll
//    public void setUp() throws Exception {
//        card = new SmartCard();
//        card.setId(1);
//        card.setBalance(100);
//        card.setTraveller(new Traveller(1L, "Munish"));
//    }
//
//    @Test
//    public void testCalculateFootFallForStation() throws Exception {
//        metroService.swipeIn(card, Stations.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
//        metroService.swipeOut(card, Stations.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
//
//        metroService.swipeIn(card, Stations.A6, LocalDateTime.of(2016, Month.APRIL, 10, 19, 05));
//        metroService.swipeOut(card, Stations.A10, LocalDateTime.of(2016, Month.APRIL, 10, 19, 15));
//
////        assertThat("FootFall for station A6 should be 2", metroService.calculateFootFall(Stations.A6), equalTo(2));
////        assertThat("FootFall for station A1 should be 1", metroService.calculateFootFall(Stations.A1), equalTo(1));
////        assertThat("FootFall for station A10 should be 1", metroService.calculateFootFall(Stations.A10), equalTo(1));
//        Assertions.assertEquals(metroService.calculateFootFall(Stations.A6), 2, "FootFall for station A6 should be 2");
//        Assertions.assertEquals(metroService.calculateFootFall(Stations.A1), 1, "FootFall for station A1 should be 1");
//        Assertions.assertEquals(metroService.calculateFootFall(Stations.A10), 1, "FootFall for station A10 should be 1");
//    }
//
//    @Test
//    public void testCardReport() throws Exception {
//        metroService.swipeIn(card, Stations.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
//        metroService.swipeOut(card, Stations.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
//
//        metroService.swipeIn(card, Stations.A6, LocalDateTime.of(2016, Month.APRIL, 10, 19, 05));
//        metroService.swipeOut(card, Stations.A10, LocalDateTime.of(2016, Month.APRIL, 10, 19, 15));
//        final List<CardTrx> trxs = metroService.cardReport(card);
//
//        Assertions.assertEquals(trxs.size(), 2, "There should be 2 trxs for this card");
//        // assertThat("There should be 2 trxs for this card", trxs.size(), equalTo(2));
////    //    assertThat("One of the Trx should be charged 35", trxs.toArray(new CardTrx[0]), hasItemInArray(new CustomMatcher<CardTrx>("Fare shall be 35") {
////            @Override
////            public boolean matches(Object o) {
////                CardTrx trx = (CardTrx) o;
////                return trx.getFare() == 35.0 && trx.getFareStrategyUsed() instanceof WeekdayFareStrategy && trx.distance == 5;
////            }
////        }));
//
////        assertThat("Other Trx should be charged 35", trxs.toArray(new CardTrx[0]), hasItemInArray(new CustomMatcher<CardTrx>("Fare shall be 35") {
////            @Override
////            public boolean matches(Object o) {
////                CardTrx trx = (CardTrx) o;
////                return trx.getFare() == 22.0 && trx.getFareStrategyUsed() instanceof WeekendFareStrategy && trx.distance == 4;
////            }
////        }));
//    }
//
//    @Test
//    public void testMinimumBalanceAtSwipeIn() throws Exception {
//        Assertions.assertThrows(MinimumCardBalanceException.class, () -> {
//            card.setBalance(1);
//            metroService.swipeIn(card, Stations.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
//            metroService.swipeOut(card, Stations.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
//        });
//
//    }
//
//    @Test
//    public void testSufficientBalanceAtSwipeOut() throws Exception {
//
//        Assertions.assertThrows(InsufficientCardBalance.class, () -> {
//            card.setBalance(6);
//            metroService.swipeIn(card, Stations.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
//            metroService.swipeOut(card, Stations.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
//        });
//
//    }
//}
//
//
