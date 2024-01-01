package org.algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

//WAP to find the deepest node in a binary tree
public class DeepestNode {
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
//        binaryTree.root.right.right.left = new BinaryTreeNode(8);

        DeepestNode deepestNode = new DeepestNode();
        System.out.println(deepestNode.findDeepestNode(binaryTree.root));
    }

//    Do a level-order traversal and return the last visited node which is considered the deepest
    public int findDeepestNode(BinaryTreeNode node){
        Queue<BinaryTreeNode> queue = new LinkedList<>();

        if(node != null){
            queue.add(node);

            while (!queue.isEmpty()){
                node = queue.poll();

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);
            }
        }
        return node.data;
    }

}
