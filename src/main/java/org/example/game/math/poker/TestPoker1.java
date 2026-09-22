package org.example.game.math.poker;


public class TestPoker1
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

      /* =============================
         Deal cards to 2 players
         ============================= */
        for ( i = 0; i < 5; i++ )
        {
            player1[i] = a.deal();
            player2[i] = a.deal();
        }

        System.out.print("player1's hand: ");
        for ( i = 0; i < 5; i++ )
            System.out.print( player1[i] + "  ");
        System.out.println();

        System.out.print("player2's hand: ");
        for ( i = 0; i < 5; i++ )
            System.out.print( player2[i] + "  ");
        System.out.println();
    }
}