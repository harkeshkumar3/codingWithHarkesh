package org.example.coding;

public class SecondAndHightestNumber {
    public static void main(String[] args) {


        int array[] = {2, 4, 19, 23, 41, 22, 20};


        int ndHighest = find2ndHighest(array);
        System.out.println(ndHighest);

        int dHighest = findSecondHighest(array);
        System.out.println(dHighest);
    }

    private static int find2ndHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            }else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
}
