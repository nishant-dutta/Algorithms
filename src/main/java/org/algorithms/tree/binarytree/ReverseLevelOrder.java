package org.algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// WAP to print the elements of a binary tree in reverse level order
public class ReverseLevelOrder {
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

        ReverseLevelOrder reverseLevelOrder = new ReverseLevelOrder();
        System.out.print("Reverse Level-order: ");
        reverseLevelOrder.printReverseOrder(binaryTree.root);
    }

    public void printReverseOrder(BinaryTreeNode node){
        if(node != null){
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            Stack<BinaryTreeNode> stack = new Stack<>();

            queue.add(node);
            while (!queue.isEmpty()){
                node = queue.poll();

                stack.push(node);

                if(node.right != null)
                    queue.add(node.right);

                if(node.left != null)
                    queue.add(node.left);
            }

            while (!stack.isEmpty()){
                System.out.print(stack.pop().data + " ");
            }
        }
    }
}
