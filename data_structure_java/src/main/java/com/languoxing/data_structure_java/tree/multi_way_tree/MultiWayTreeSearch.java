package com.languoxing.data_structure_java.tree.multi_way_tree;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println("depth first search:");
        System.out.println(paths);
        System.out.println("max depth:");
        System.out.println((new MultiWayTreeSearch()).maxDepth(head));
        List<List<Integer>> levels = new MultiWayTreeSearch().wfsRecursive(head);
        System.out.println("width first search");
        System.out.print(levels);
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

    public int maxDepth(MultiWayTreeNode root) {
        List<Integer> maxDepth = new ArrayList<Integer>(Arrays.asList(0));
        List<Integer> depth = new ArrayList<Integer>(Arrays.asList(0));
        buildPaths1(root, maxDepth, depth);
        return maxDepth.get(0);
    }

    public void buildPaths1(MultiWayTreeNode root, List<Integer> maxDepth, List<Integer> depth) {
        if (root != null) {
            depth.set(0, depth.get(0) + 1);
            if (root.getChildren() == null || root.getChildren().size() == 0) {
                maxDepth.set(0, depth.get(0) > maxDepth.get(0) ? depth.get(0) : maxDepth.get(0));
            } else {
                for (MultiWayTreeNode child : root.getChildren()) {
                    List<Integer> depth1 = new ArrayList<Integer>(depth);
                    buildPaths1(child, maxDepth, depth1);
                }
            }
        }
    }

    public List<List<Integer>> wfsRecursive(MultiWayTreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        int depth = 0;
        getLevels(root, levels, depth);
        return levels;
    }

    public void getLevels(MultiWayTreeNode root, List<List<Integer>> levels, int depth) {
        if (root != null) {
            if (levels.size() == depth) {
                levels.add(new ArrayList<Integer>());
            }
            levels.get(depth).add(root.getVal());
            for (MultiWayTreeNode child : root.getChildren()) {
                getLevels(child, levels, depth + 1);
            }
        }
    }

}