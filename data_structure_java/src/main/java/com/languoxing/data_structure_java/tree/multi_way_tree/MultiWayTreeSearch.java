package com.languoxing.data_structure_java.tree.multi_way_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultiWayTreeSearch {
    public static void main(String[] args) {
        MultiWayTreeNode head = new MultiWayTreeNode(1);
        MultiWayTreeNode two = new MultiWayTreeNode(2);
        MultiWayTreeNode three = new MultiWayTreeNode(3);
        MultiWayTreeNode four = new MultiWayTreeNode(4);
        MultiWayTreeNode five = new MultiWayTreeNode(5);
        MultiWayTreeNode six = new MultiWayTreeNode(6);
        MultiWayTreeNode seven = new MultiWayTreeNode(7);
        MultiWayTreeNode eight = new MultiWayTreeNode(8);
        MultiWayTreeNode nine = new MultiWayTreeNode(9);
        MultiWayTreeNode ten = new MultiWayTreeNode(10);
        head.addChildren(two);
        head.addChildren(three);
        head.addChildren(four);
        two.addChildren(five);
        three.addChildren(six);
        three.addChildren(seven);
        seven.addChildren(eight);
        seven.addChildren(nine);
        seven.addChildren(ten);
        List<List<Integer>> paths = (new MultiWayTreeSearch()).dfsRecursive(head);
        System.out.println(paths);
    }

    public List<List<Integer>> dfsRecursive(MultiWayTreeNode root) {
        List<List<Integer>> paths = new LinkedList<List<Integer>>();
        List<Integer> path = new LinkedList<Integer>();
        buildPaths(root, paths, path);
        return paths;

    }

    public void buildPaths(MultiWayTreeNode root, List<List<Integer>> paths, List<Integer> path) {
        if (root != null) {
            path.add(root.getVal());
            if (root.getChildren() == null || root.getChildren().size() == 0) {
                paths.add(new ArrayList<Integer>(path));
            } else {
                for (MultiWayTreeNode child : root.getChildren()) {
                    List<Integer> path1 = new LinkedList<Integer>(path);
                    buildPaths(child, paths, path1);
                }
            }
        }
    }

}