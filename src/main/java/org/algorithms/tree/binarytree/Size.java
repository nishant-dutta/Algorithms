package org.algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
// WAP to find the number of nodes in a tree i.e. size of tree
public class Size {
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

        Size size = new Size();

        System.out.println("Size Recursively: " + size.sizeRecursively(binaryTree.root));
        System.out.println("Size Non-Recursively: " + size.sizeNonRecursively(binaryTree.root));
    }

    public int sizeRecursively(BinaryTreeNode node){
        if(node != null){
            int l = sizeRecursively(node.left);
            int r = sizeRecursively(node.right);

            return l+r+1;
        }
        return 0;
    }

//    We can use preOrder/postOrder/InOrder traversal for calculating size
    public int sizeNonRecursively(BinaryTreeNode node){
        if(node != null){
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            int size = 0 ;

            queue.add(node);
            while (!queue.isEmpty()){
                node = queue.poll();
                size++;

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);
            }

            return size;
        }
        return 0;
    }

}
