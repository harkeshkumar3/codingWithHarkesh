package org.example.game.math.poker;//package com.game.math.poker;
//
///* -----------------------------------------------------
//   Card2:
//
//
//     Suit: 4 = Spade
//	   3 = Heart
//	   2 = Club
//	   1 = Diamond
//
//     Value: A = 1
//	    2 = 2
//	    ...
//	    J = 11
//	    Q = 12
//	    K = 13
//
//     cardValue =  100*Suit + Value
//   ----------------------------------------------------- */
//
//public class Card2
//{
//    public static final int SPADE   = 4;
//    public static final int HEART   = 3;
//    public static final int CLUB    = 2;
//    public static final int DIAMOND = 1;
//
//    private static final String[] Suit = { "*", "d", "c", "h", "s"};
//    private static final String[] Value = { "*", "A", "2", "3", "4",
//            "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//
//    public int cardValue;
//
//    public Card( int suit, int value )
//    {
//        if ( value == 1 )
//            cardValue = suit*100 + 14;      // Give Ace the value 14
//        else
//            cardValue = suit*100 + value;
//    }
//
//    public int suit()
//    {
//        return ( cardValue / 100 );
//    }
//
//    public int rank()
//    {
//        return ( cardValue % 100 );
//    }
//
//    public String toString()
//    {
//        return ( Value[ cardValue % 100 ] + Suit[ cardValue / 100 ] );
//    }
//}