package org.algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
// WAP to find maximum element in a tree
public class Maximum {
    public static void main(String[] args) {
        // Creating a binary tree
        BinaryTree binaryTree = new BinaryTree(new BinaryTreeNode(1));

        // Adding nodes
        binaryTree.root.left = new BinaryTreeNode(2);
        binaryTree.root.right = new BinaryTreeNode(3);
        binaryTree.root.left.left = new BinaryTreeNode(14);
        binaryTree.root.left.right = new BinaryTreeNode(5);
        binaryTree.root.right.left = new BinaryTreeNode(6);
        binaryTree.root.right.right = new BinaryTreeNode(7);

        Maximum maximum = new Maximum();
        System.out.println("Maximum: " + maximum.findMaxRecursively(binaryTree.root));
        System.out.println("Maximum: " + maximum.findMaxNonRecursively(binaryTree.root));
    }

    public int findMaxRecursively(BinaryTreeNode node){
        if(node != null){
            int l = findMaxRecursively(node.left);
            int r = findMaxRecursively(node.right);

            return Math.max(node.data, Math.max(l, r));
        }
        return Integer.MIN_VALUE;
    }

    public int findMaxNonRecursively(BinaryTreeNode node){
        int max = Integer.MIN_VALUE;
        if(node != null){
            Queue<BinaryTreeNode> queue = new LinkedList<>();

            queue.add(node);
            while (!queue.isEmpty()){
                BinaryTreeNode temp = queue.poll();
                if(temp.data > max)
                    max = temp.data;

                if(temp.left != null)
                    queue.add(temp.left);

                if(temp.right != null)
                    queue.add(temp.right);
            }
        }
        return max;
    }
}
