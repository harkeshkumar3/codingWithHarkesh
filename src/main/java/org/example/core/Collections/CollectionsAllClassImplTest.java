package org.example.core.Collections;

import java.util.*;

public class CollectionsAllClassImplTest {
    public static void main(String[] args) {
        System.out.println("____________________________________________ \n Set : - ");
        HashSet<String> listHashSet = new LinkedHashSet<>();
        listHashSet.add(null);
        listHashSet.add("c");
        listHashSet.add("a");
        listHashSet.add("b");
        listHashSet.add(null);
        listHashSet.add("c");
        listHashSet.add("a");
        listHashSet.add("c");
        listHashSet.add("a");
        listHashSet.add("d");
        System.out.printf("LinkHashSet = ");
        System.out.println(listHashSet);

        HashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add(null);
        hashSet.add("c");
        hashSet.add("a");
        hashSet.add("a");
        hashSet.add(null);
        hashSet.add("b");
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        System.out.printf("hashSet = ");
        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("a");
//        treeSet.add(null);
//        treeSet.add(null);
        treeSet.add("b");
        treeSet.add("b");
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("d");
        System.out.printf("treeSet = ");
        System.out.println(treeSet);
        System.out.println("____________________________________________ \n List : - ");

        List<String> vector = new Vector<>();
        vector.add("b");
        vector.add(null);
        vector.add("a");
        vector.add("a");
        vector.add(null);
        vector.add(null);
        vector.add("b");
        vector.add("c");
        vector.add("a");
        vector.add("c");
        vector.add("d");
        System.out.printf("vector = ");
        System.out.println(vector);

        List<String> arrayList = new ArrayList<>();
        arrayList.add("b");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("c");
        arrayList.add("d");
        System.out.printf("arrayList = ");
        System.out.println(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("b");
        linkedList.add("a");
        linkedList.add("a");
        linkedList.add("c");
        linkedList.add("a");
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add("d");
        System.out.printf("linkedList = ");
        System.out.println(linkedList);


        System.out.println("____________________________________________ \n Map : - ");
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "a");
        hashMap.put("c", "c");
        hashMap.put("a", "a");
        hashMap.put(null, null);
        hashMap.put(null, "y");
        hashMap.put("b", "b");
        hashMap.put("a", "Z");
        hashMap.put("d", "d");

        System.out.printf("hashMap = ");
        System.out.println(hashMap);

        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("b", "b");
        hashtable.put("c", "c");
        hashtable.put("a", "a");
        //    hashtable.put("a",null);
        //    hashtable.put(null,"y");
        hashtable.put("c", "c");
        hashtable.put("b", "b");
        hashtable.put("a", "Z");
        hashtable.put("d", "d");
        System.out.printf("hashtable = ");
        System.out.println(hashtable);

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("b", "b");
        linkedHashMap.put("a", "a");
        linkedHashMap.put("b", "b");
        linkedHashMap.put("a", null);
        linkedHashMap.put(null, "y");
        linkedHashMap.put("c", "c");
        linkedHashMap.put("a", "Z");
        linkedHashMap.put("d", "d");
        System.out.printf("linkedHashMap = ");
        System.out.println(linkedHashMap);


        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("b", "b");
        treeMap.put("c", "c");
        treeMap.put("a", "a");
        treeMap.put("b", "b");
        treeMap.put("a", null);
        treeMap.put("x", null);
        treeMap.put("y", null);

        //treeMap.put(null, "y"); // Null as Key not allowed
        treeMap.put("c", "c");
        //   treeMap.put("a", "Z");
        treeMap.put("d", "d");
        System.out.printf("treeMap = ");
        System.out.println(treeMap);
        System.out.println("____________________________________________ \n Queue : - ");

        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add("c");
        linkedListQueue.add("a");
        linkedListQueue.add("a");
        linkedListQueue.add("b");
        linkedListQueue.add("a");
        linkedListQueue.add(null);
        linkedListQueue.add(null);
        linkedListQueue.add("d");
        System.out.printf("linkedListQueue = ");
        System.out.println(linkedListQueue);


        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("a");
        priorityQueue.add("c");
        priorityQueue.add("a");
        priorityQueue.add("b");
        priorityQueue.add("a");
//        priorityQueue.add(null);
//        priorityQueue.add(null);
        priorityQueue.add("d");
        System.out.printf("priorityQueue = ");
        System.out.println(priorityQueue);
    }
}
