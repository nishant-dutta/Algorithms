package org.algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/*
 * WAP to delete a node from it by making sure that the tree shrinks from the bottom (i.e. the deleted node is replaced
 * by the bottom-most and rightmost node). This is different from BST deletion. Here we do not have any order among
 * elements, so we replace them with the last element
 * */
public class DeletingNode {
    public static void main(String[] args) {
        // Creating a binary tree
        BinaryTree binaryTree = new BinaryTree(new BinaryTreeNode(1));

        // Adding nodes
        binaryTree.root.left = new BinaryTreeNode(2);
        binaryTree.root.right = new BinaryTreeNode(3);
        binaryTree.root.left.left = new BinaryTreeNode(4);
        binaryTree.root.left.right = new BinaryTreeNode(5);
        binaryTree.root.right.left = new BinaryTreeNode(6);
        binaryTree.root.right.right = new BinaryTreeNode(7);
        binaryTree.root.right.right.left = new BinaryTreeNode(8);

        DeletingNode deletingNode = new DeletingNode();
        binaryTree.root = deletingNode.delete(binaryTree.root, 1);

        NonRecursiveTraversal nonRecursiveTraversal = new NonRecursiveTraversal();
        nonRecursiveTraversal.levelOrder(binaryTree.root);
    }

    public BinaryTreeNode delete(BinaryTreeNode rootNode, int data) {
        if (rootNode.data == data && rootNode.left == null && rootNode.right == null) {
            return null;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode searchNodeRef = null;

        BinaryTreeNode prevParent = rootNode;
        String matchDirection = "";

        BinaryTreeNode temp = null;

        queue.add(rootNode);
        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.data == data) {
                searchNodeRef = temp;
            }

            if (temp.left != null) {
                queue.add(temp.left);
                matchDirection = "left";
                prevParent = temp;
            }

            if (temp.right != null) {
                queue.add(temp.right);
                matchDirection = "right";
                prevParent = temp;
            }

        }

        searchNodeRef.data = temp.data;
        if (matchDirection.equals("right")) {
            prevParent.right = null;
        }

        if (matchDirection.equals("left")) {
            prevParent.left = null;
        }
        return rootNode;
    }
}
