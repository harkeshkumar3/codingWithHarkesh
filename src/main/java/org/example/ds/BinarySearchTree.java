package org.example.ds;


class Node {
    int data;
    Node left;
    Node right;
}

class BST {

    public Node insertData(Node node, int value) {
        if (node == null) {
            return createNewNode(value);
        }
        if (value < node.data) {
            node.left = insertData(node.left, value);
        } else if (value > node.data) {
            node.right = insertData(node.right, value);
        }
        return node;
    }

    private Node createNewNode(int value) {
        Node n = new Node();
        n.data = value;
        n.left = null;
        n.right = null;
        return n;
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST();
        Node root = null;

        root = bst.insertData(root, 8);
        root = bst.insertData(root, 3);
        root = bst.insertData(root, 6);
        root = bst.insertData(root, 10);
        root = bst.insertData(root, 4);
        root = bst.insertData(root, 7);
        root = bst.insertData(root, 1);
        root = bst.insertData(root, 14);
        root = bst.insertData(root, 13);
    }
}
