package org.example.ds;

public class TimeComplexity {

    public static void main(String[] args) {


        int n = 10;
        int x = 10, y = 10;
        //1.  Single Loop
        for (int i = 0; i < n; i++) {
            int z = x + y; //// Constant time = C

            /*
                    C n
                    O(n) is time complexity
            * */
        }
//###############################################################
        //3.  Nested Loop
        for (int i = 0; i < n; i++) {
            // Outer loop in Cn
            for (int j = 0; j < n; j++) {
                // Inner loop n * Cn
                int z = x + y; //// Constant time = C n2
            }

            /*
                    C n2
                    O(n2) is time complexity
            * */
        }
//###############################################################
        //3.  Sequential  Loop
        int z = x + y;  // constant c1

        for (int i = 0; i < n; i++) {
            //  loop in Cn
        }
        for (int j = 0; j < n; j++) {
            // lopp in cn
            int a = x + y; //// Constant time = C n
        }

        // c1 + cn+ cn
        //        which has  big time complexity that will be time complexity of program
        //O(n)
//###############################################################

        if (x > y) {
            // ..........O(n)
        } else {
            //>...........O(n2)
        }
        //        which has  big time complexity that will be time complexity of program
        // O(n2)
        // ########################################


        /*
           O(1) < O(log n) < O(n) < O(n log n) < O(nc) < O(n!)
        * */

    }
}


