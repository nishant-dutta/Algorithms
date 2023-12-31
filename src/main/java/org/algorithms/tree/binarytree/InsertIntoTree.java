package org.algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

// WAP to insert a node into a binary tree
public class InsertIntoTree {
    public static void main(String[] args) {
        // Creating a binary tree
        BinaryTree binaryTree = new BinaryTree(new BinaryTreeNode(1));

        // Adding nodes
        binaryTree.root.left = new BinaryTreeNode(2);
        binaryTree.root.right = new BinaryTreeNode(3);
        binaryTree.root.left.left = new BinaryTreeNode(4);
//        binaryTree.root.left.right = new BinaryTreeNode(5);
        binaryTree.root.right.left = new BinaryTreeNode(6);
        binaryTree.root.right.right = new BinaryTreeNode(7);

        InsertIntoTree insertIntoTree = new InsertIntoTree();

        insertIntoTree.insert(binaryTree.root, new BinaryTreeNode(8));

//        traverse to see if node was added
        NonRecursiveTraversal nonRecursiveTraversal = new NonRecursiveTraversal();
        nonRecursiveTraversal.levelOrder(binaryTree.root);
    }

//    Do a level order traversal from left to right and insert the missing element
    public void insert(BinaryTreeNode node, BinaryTreeNode newNode){
        if(node != null){
            Queue<BinaryTreeNode> queue = new LinkedList<>();

            queue.add(node);
            while (!queue.isEmpty()){
                BinaryTreeNode temp = queue.poll();

                if(temp.left != null) {
                    queue.add(temp.left);
                }else{
                    temp.left = newNode;
                    return;
                }

                if(temp.right != null){
                    queue.add(temp.right);
                }else{
                    temp.right = newNode;
                    return;
                }
            }
        }
    }
}
