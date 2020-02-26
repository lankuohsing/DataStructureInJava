package com.languoxing.data_structure_java.tree.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         * BinaryTree node10 = new BinaryTree(10, null, null); BinaryTree node8 = new
         * BinaryTree(8, null, null); BinaryTree node9 = new BinaryTree(9, null,
         * node10); BinaryTree node4 = new BinaryTree(4, null, null); BinaryTree node5 =
         * new BinaryTree(5, node8, node9); BinaryTree node6 = new BinaryTree(6, null,
         * null); BinaryTree node7 = new BinaryTree(7, null, null); BinaryTree node2 =
         * new BinaryTree(2, node4, node5); BinaryTree node3 = new BinaryTree(3, node6,
         * node7); BinaryTree node1 = new BinaryTree(1, node2, node3);
         */
        BinaryTree node3 = new BinaryTree(3, null, null);
        BinaryTree node2 = new BinaryTree(2, node3, null);
        BinaryTree node1 = new BinaryTree(1, null, node2);

        TraversalBinaryTree tree = new TraversalBinaryTree();
        // 采用递归的方式进行遍历
        System.out.println("-----前序遍历------");
        System.out.print("递归:\t");
        tree.preOrderRecursive(node1);
        System.out.println();

        // 采用非递归的方式遍历
        System.out.print("非递归:\t");
        tree.preOrderNonRecursive(node1);
        System.out.println();

        List<Integer> results = new ArrayList<Integer>();
        results = tree.inorderTraversal(node1);
    }
}
