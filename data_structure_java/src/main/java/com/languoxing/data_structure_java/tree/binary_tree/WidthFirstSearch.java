package com.languoxing.data_structure_java.tree.binary_tree;

import java.util.LinkedList;
import java.util.List;

public class WidthFirstSearch {
    public static void main(String[] args) {
        BinaryTree head = new BinaryTree(1);
        BinaryTree second = new BinaryTree(2);
        BinaryTree three = new BinaryTree(3);
        BinaryTree four = new BinaryTree(4);
        BinaryTree five = new BinaryTree(5);
        BinaryTree six = new BinaryTree(6);
        BinaryTree seven = new BinaryTree(7);
        head.setRight(three);
        head.setLeft(second);
        second.setRight(five);
        second.setLeft(four);
        three.setRight(seven);
        three.setLeft(six);

        System.out.println("深度优先遍历结果(递归)：");
        List<List<Integer>> levels = new WidthFirstSearch().widthFirstSearchRecursive(head);
        for (List<Integer> level : levels) {
            System.out.println(level);
        }
    }

    List<List<Integer>> widthFirstSearchRecursive(BinaryTree root) {
        List<List<Integer>> levels = new LinkedList<List<Integer>>();
        int depth = 0;
        getLevels(root, depth, levels);
        return levels;
    }

    // 广度优先遍历
    public void getLevels(BinaryTree root, int depth, List<List<Integer>> levels) {
        if (root != null) {
            if (levels.size() == depth) {
                levels.add(new LinkedList<Integer>());

            }
            levels.get(depth).add(root.getData());

            getLevels(root.getLeft(), depth + 1, levels);

            getLevels(root.getRight(), depth + 1, levels);

        }

    }

}
