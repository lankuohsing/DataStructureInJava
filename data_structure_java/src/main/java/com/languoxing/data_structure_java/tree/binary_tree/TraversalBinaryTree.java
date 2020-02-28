package com.languoxing.data_structure_java.tree.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * 遍历二叉树
 */
public class TraversalBinaryTree {

    /*
     * 采用递归的方式前序遍历.先访问根节点，再访问左节点，最后访问右节点
     */
    public void preOrderRecursive(BinaryTree root) {
        if (root != null) {
            System.out.print(root.getData() + "\t");
            preOrderRecursive(root.getLeft());
            preOrderRecursive(root.getRight());
        }
    }

    public void preOrderRecursive(BinaryTree root, List<Integer> results) {
        if (root != null) {
            results.add(root.getData());
            preOrderRecursive(root.getLeft(), results);
            preOrderRecursive(root.getRight(), results);
        }
    }

    /*
     * 采用递归的方式前序遍历.先访问根节点，再访问左节点，最后访问右节点
     */
    public void preOrderNonRecursive(BinaryTree root) {
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        while (true) {
            while (root != null) {
                System.out.print(root.getData() + "\t");
                stack.push(root);
                root = root.getLeft();
            }
            if (stack.isEmpty()) {
                break;
            }
            root = stack.pop();
            root = root.getRight();

        }
    }

    /*
     * 采用递归的方式中序遍历.先访问左节点，再访问根节点，最后访问右节点
     */
    public void inOrderRecursive(BinaryTree root, List<Integer> results) {
        if (root != null) {
            inOrderRecursive(root.getLeft(), results);
            results.add(root.getData());
            inOrderRecursive(root.getRight(), results);
        }
    }

    public List<Integer> inorderTraversalReturn(BinaryTree root) {
        List<Integer> results = new ArrayList();
        while (root != null) {
            List<Integer> results1 = new ArrayList();
            results1 = inorderTraversalReturn(root.getLeft());
            results1.add(root.getData());
            results = results1;
            results1 = inorderTraversalReturn(root.getRight());
            results.addAll(results1);
            break;

        }
        return results;

    }

    /*
     * 采用递归的方式后序遍历.先访问右节点，再访问根节点，最后访问左节点
     */
    public void postOrderRecursive(BinaryTree root, List<Integer> results) {
        if (root != null) {
            inOrderRecursive(root.getLeft(), results);
            inOrderRecursive(root.getRight(), results);
            results.add(root.getData());
        }
    }

}
