package org.example.leetcode;

/*
Given a Collection of intervals, merge all overlapping intervals

given - [1,3], [2,6], [8,10], [15,18]
Output - [1,6], [8,10], [15,18]
* * */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args) {
        Intervals in1 = new Intervals(1, 3);
        Intervals in2 = new Intervals(2, 6);
        Intervals in3 = new Intervals(8, 10);
        Intervals in4 = new Intervals(15, 20);
        ArrayList<Intervals> list = new ArrayList<>();
        list.add(in1);
        list.add(in2);
        list.add(in3);
        list.add(in4);
        ArrayList<Intervals> merge = merge(list);
        System.out.println(merge);
    }

    public static ArrayList<Intervals> merge(ArrayList<Intervals> intervalsList) {
        if (intervalsList == null || intervalsList.size() <= 1) {
            return intervalsList;
        }
        Collections.sort(intervalsList, new IntervalsComparator());
        ArrayList<Intervals> results = new ArrayList<>();
        Intervals prev = intervalsList.get(0);

        for (int i = 1; i < intervalsList.size(); i++) {
            Intervals curr = intervalsList.get(i);
            if (prev.end >= curr.start) {
                Intervals merged = new Intervals(prev.start, curr.end);
                prev = merged;
            } else {
                results.add(prev);
                prev = curr;
            }
        }
        results.add(prev);
        return results;
    }

    static class IntervalsComparator implements Comparator<Intervals> {
        @Override
        public int compare(Intervals o1, Intervals o2) {
            return o1.start - o2.start;
        }
    }
}

class Intervals {
    int start;
    int end;

    public Intervals(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
