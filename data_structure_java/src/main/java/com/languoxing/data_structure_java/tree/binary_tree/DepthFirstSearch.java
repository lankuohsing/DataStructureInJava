package com.languoxing.data_structure_java.tree.binary_tree;

import java.util.LinkedList;
import java.util.List;

public class DepthFirstSearch {
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
        List<String> paths = new DepthFirstSearch().depthFirstSearchRecursive(head);
        for (String path : paths) {
            System.out.println(path);
        }
    }

    List<String> depthFirstSearchRecursive(BinaryTree root) {
        List<String> paths = new LinkedList<String>();
        String path = "";
        constructPaths(root, path, paths);
        return paths;
    }

    // 深度优先遍历
    public void constructPaths(BinaryTree root, String path, List<String> paths) {
        if (root != null) {
            path += Integer.toString(root.getData());
            if (root.getLeft() == null && root.getRight() == null) {
                paths.add(path);
                return;
            } else {
                path += "->";
                constructPaths(root.getLeft(), path, paths);
                constructPaths(root.getRight(), path, paths);
            }
        }

    }

}
