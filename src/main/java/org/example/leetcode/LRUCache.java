package org.example.leetcode;


import java.util.HashMap;
import java.util.Map;

class Node {
    public final int key;
    public int value;
    public Node left;
    public Node right;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    public static void main(String[] args) {
        LRUCache2 lRUCache = new LRUCache2(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4
    }
}

class LRUCache2 {
    private final Map<Integer, Node> map;
    private final int capacity;
    Node start = null;
    Node end = null;

    public LRUCache2(int size) {
        this.map = new HashMap<>();
        this.capacity = size;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            deleteFromList(node);
            setListHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            deleteFromList(node);
        } else {
            if (map.size() >= capacity) {
                map.remove(end.key);
                deleteFromList(end);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            setListHead(node);
        }
    }

    private void deleteFromList(Node node) {
        if (node.left == null) {
            start = node.right;
        } else {
            node.left.right = node.right;
        }
        if (node.right == null) {
            end = node.left;
        } else {
            node.right.left = node.left;
        }
    }

    private void setListHead(Node node) {
        node.left = null;
        // if start is null
        if (start != null) {
            node.right = start;
            start.left = node;
        }
        start = node;
        // only node in the list
        if (end == null)
            end = start;
    }
}
