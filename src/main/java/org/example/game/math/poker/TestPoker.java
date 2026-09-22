package org.example.game.math.poker;


public class TestPoker
{
    public static void main(String[] args)
    {
        DeckOfCards a;
        Card[] player1 = new Card[5];
        int i;

        a = new DeckOfCards();
        System.out.println(a);

        System.out.println("Shuffle cards....");
        a.shuffle(1000);
        System.out.println(a);

        for ( i = 0; i < 5; i++ )
            player1[i] = a.deal();

/*
      player1[0] = new Card( 1, 1);
      player1[1] = new Card( 2, 1);
      player1[2] = new Card( 3, 1);
      player1[3] = new Card( 1, 11);
      player1[4] = new Card( 2, 11);
*/


        System.out.print("Hand:         ");
        for ( i = 0; i < 5; i++ )
            System.out.print( player1[i] + "  ");
        System.out.println();


        Poker.sortByRank(player1);

        System.out.print("Sort by rank: ");
        for ( i = 0; i < 5; i++ )
            System.out.print( player1[i] + "  ");
        System.out.println();

        Poker.sortBySuit(player1);

        System.out.print("Sort by suit: ");
        for ( i = 0; i < 5; i++ )
            System.out.print( player1[i] + "  ");
        System.out.println();
        System.out.println();

        boolean x;

        x = Poker.isFullHouse(player1);
        System.out.println("isFullHouse: " + x);

        x = Poker.isFlush(player1);
        System.out.println("isFlush: " + x);

        x = Poker.isStraight(player1);
        System.out.println("isStraight: " + x);

        x = Poker.is4s(player1);
        System.out.println("is4s: " + x);

        x = Poker.is3s(player1);
        System.out.println("is3s: " + x);

        x = Poker.is22s(player1);
        System.out.println("is22s: " + x);

        x = Poker.is2s(player1);
        System.out.println("is2s: " + x);

        System.out.println();
        System.out.println("Value of hand = " + Poker.valueHand(player1) );
        System.out.println();
        System.out.println();

    }
}