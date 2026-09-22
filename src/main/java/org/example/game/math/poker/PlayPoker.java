package org.example.game.math.poker;


public class PlayPoker
{
    public static void main(String[] args)
    {
        DeckOfCards a;

        Card[] player1 = new Card[5];
        Card[] player2 = new Card[5];

        int i;

        a = new DeckOfCards();
        System.out.println(a);

        System.out.println("Shuffle cards....");
        a.shuffle(1000);
        System.out.println(a);

        for ( i = 0; i < 5; i++ )
        {
            player1[i] = a.deal();
          //  System.out.println("Deal player one "+a.deal());
            System.out.println(player1[i]);
            player2[i] = a.deal();
        }

        System.out.print("Player 1's hand: ");
        for ( i = 0; i < 5; i++ )
            System.out.print( player1[i] + "  ");
        System.out.println(" - value = " +  Poker.valueHand(player1) );

        System.out.print("Player 2's hand: ");
        for ( i = 0; i < 5; i++ )
            System.out.print( player2[i] + "  ");
        System.out.println(" - value = " +  Poker.valueHand(player2) );
        System.out.println();
        System.out.println();

        if ( Poker.valueHand(player1) > Poker.valueHand(player2) )
            System.out.println("Player 1 wins");
        else if ( Poker.valueHand(player1) < Poker.valueHand(player2) )
            System.out.println("Player 2 wins");
        else
            System.out.println("Player hands are a tie");
        System.out.println();

    }
}