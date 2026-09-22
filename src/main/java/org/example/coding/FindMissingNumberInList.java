package org.example.coding;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumberInList {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        List<Integer> collect = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());
//        int solution = solution(A);
//        System.out.println("missing is =" + solution);

        for (int e : A) {
            System.out.println(e);

        }

    }

    public static int solution(int[] a) {
        IntStream distinct = Arrays.stream(a).distinct();
        int max = distinct.max().getAsInt();
        int length = a.length - 1;
        int sum = IntStream.range(1, max + 1).sum();
        int actualSum = Arrays.stream(a).distinct().sum();
        if (actualSum < 0)
            return 1;
        else if (actualSum == sum)
            return max + 1;
        else
            return sum - actualSum;

    }


}

