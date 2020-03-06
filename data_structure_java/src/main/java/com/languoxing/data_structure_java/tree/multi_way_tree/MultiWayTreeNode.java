package com.languoxing.data_structure_java.tree.multi_way_tree;

import java.util.ArrayList;
import java.util.List;

public class MultiWayTreeNode {
    private int val;
    private List<MultiWayTreeNode> children;

    public MultiWayTreeNode() {
        this.children = new ArrayList<MultiWayTreeNode>();
    }

    public MultiWayTreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<MultiWayTreeNode>();
    }

    public MultiWayTreeNode(int val, List<MultiWayTreeNode> children) {
        this.val = val;
        this.children = new ArrayList<MultiWayTreeNode>();
        for (MultiWayTreeNode child : children) {
            this.children.add(child);
        }
    }

    public int getVal() {
        return this.val;
    }

    public List<MultiWayTreeNode> getChildren() {
        return this.children;
    }

    public void setChildren(List<MultiWayTreeNode> children) {
        if (this.children != null) {
            for (MultiWayTreeNode child : children) {
                this.children.add(child);
            }
        }

    }

    public void addChildren(MultiWayTreeNode child) {
        if (this.children != null) {
            this.children.add(child);
        }

    }

}