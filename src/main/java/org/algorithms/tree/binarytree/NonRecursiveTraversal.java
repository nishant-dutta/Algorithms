package org.algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NonRecursiveTraversal {
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

        NonRecursiveTraversal nonRecursiveTraversal = new NonRecursiveTraversal();

        System.out.print("Pre-Order: \t\t");
        nonRecursiveTraversal.preOrder(binaryTree.root);
        System.out.println();

        System.out.print("Post-Order: \t");
        nonRecursiveTraversal.postOrder(binaryTree.root);
        System.out.println();

        System.out.print("In-Order: \t\t");
        nonRecursiveTraversal.inOrder(binaryTree.root);
        System.out.println();

        System.out.print("Level-Order: \t");
        nonRecursiveTraversal.levelOrder(binaryTree.root);
        System.out.println();
    }

//    Similar to inOrder, also known as DFS
    public void preOrder(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<>();

        while (true){

            while (root != null){
                stack.push(root);
                System.out.print(root.data + " ");
                root = root.left;
            }

            if (stack.isEmpty())
                break;

            root = stack.pop();
            root = root.right;
        }
    }

//    Similar to preOrder
    public void inOrder(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<>();

        while (true){

            while (root != null){
                stack.push(root);
                root = root.left;
            }

            if (stack.isEmpty())
                break;

            root = stack.pop();
            System.out.print(root.data + " ");
            root = root.right;
        }
    }

    public void postOrder(BinaryTreeNode root){
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode previous = null;
        do{
            while (root != null){
                stack.push(root);
                root = root.left;
            }

            while (root == null && !stack.isEmpty()){
                root = stack.peek();
                if(root.right == null || root.right == previous){
                    System.out.print(root.data + " ");
                    stack.pop();
                    previous = root;
                    root = null;
                }else{
                    root = root.right;
                }
            }
        }while (!stack.isEmpty());
    }

//    also known as BFS
    public void levelOrder(BinaryTreeNode root){
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode temp;

        if(root != null){
            queue.add(root);
            while(!queue.isEmpty()){
                temp = queue.poll();
                System.out.print(temp.data + " ");
                if(temp.left != null)
                    queue.add(temp.left);
                if(temp.right != null)
                    queue.add(temp.right);
            }
        }
    }
}
