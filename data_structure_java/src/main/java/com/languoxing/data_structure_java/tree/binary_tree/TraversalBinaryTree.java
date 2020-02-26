package com.languoxing.data_structure_java.tree.binary_tree;

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
            System.out.print(root.getDate() + "\t");
            preOrderRecursive(root.getLeft());
            preOrderRecursive(root.getRight());
        }
    }

    /*
     * 采用递归的方式前序遍历.先访问根节点，再访问左节点，最后访问右节点
     */
    public void preOrderNonRecursive(BinaryTree root) {
        Stack<BinaryTree> stack = new Stack<BinaryTree>();
        while (true) {
            while (root != null) {
                System.out.print(root.getDate() + "\t");
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

}
