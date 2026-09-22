package org.example.game.math.poker;

/* =============================================================
   Monte Carlo experiment to find the probability of Poker hands
   ============================================================= */

public class PokerProbab
{

    public static void main(String[] args)
    {
        DeckOfCards a;
        Card[] player1 = new Card[5];
        int i, j, cut, NHands;
        int NRoyal, NStraightFlush, NFlush, NStraight,
                N4s, N3s, N22s, N2s, NFullHouse, NHighCard;

        if ( args.length == 0 )
        {
            System.out.println("Usage: java PokerProbab #Hands");
            System.exit(1);
        }

        NHands = Integer.parseInt( args[0] );

        a = new DeckOfCards();

        NRoyal = NStraightFlush = NFlush = NStraight =
                N4s = N3s = N22s = N2s = NFullHouse = NHighCard = 0;

        for ( i = 1; i <= NHands ; i++ )
        {
            a.shuffle(100);		// Shuffle

            cut = (int) (20 + 10*Math.random());  // Cut the deck
            for ( j = 0; j < cut; j++ )           // Deal the cut away
                a.deal();

            for ( j = 0; j < 5; j++ )	// Deal a Poker hand
                player1[j] = a.deal();

            if ( Poker.isFlush(player1) && Poker.isStraight(player1) )
            {
                Poker.sortByRank( player1 );

                if ( player1[4].rank() == 14 )
                    NRoyal++;
                else
                    NStraightFlush++;
            }
            else if ( Poker.is4s(player1) )
                N4s++;
            else if ( Poker.isFullHouse(player1) )
                NFullHouse++;
            if ( Poker.isFlush(player1) )
                NFlush++;
            if ( Poker.isStraight(player1) )
                NStraight++;
            else if ( Poker.is3s(player1) )
                N3s++;
            else if ( Poker.is22s(player1) )
                N22s++;
            else if ( Poker.is2s(player1) )
                N2s++;
            else
                NHighCard++;


            if ( (i*10) % NHands == 0 )
                System.out.println("# Hands played = " + i);
        }

        System.out.println();
        System.out.println("Probability of Royal Flush    ~= "
                + ((double)NRoyal / NHands)*100 + "%" );
        System.out.println("Probability of Straight Flush ~= "
                + ((double)NStraightFlush / NHands)*100 + "%" );
        System.out.println("Probability of 4 of a kind    ~= "
                + ((double)N4s / NHands)*100 + "%" );
        System.out.println("Probability of Full House     ~= "
                + ((double)NFullHouse/ NHands)*100 + "%" );
        System.out.println("Probability of Flush          ~= "
                + ((double)NFlush / NHands)*100 + "%" );
        System.out.println("Probability of Straight       ~= "
                + ((double)NStraight / NHands)*100 + "%" );
        System.out.println("Probability of Set            ~= "
                + ((double)N3s / NHands)*100 + "%" );
        System.out.println("Probability of 2 Pairs        ~= "
                + ((double)N22s / NHands)*100 + "%" );
        System.out.println("Probability of 1 Pair         ~= "
                + ((double)N2s / NHands)*100 + "%" );
        System.out.println("Probability of High Card      ~= "
                + ((double)NHighCard / NHands)*100 + "%" );
        System.out.println();
        System.out.println();

    }
}