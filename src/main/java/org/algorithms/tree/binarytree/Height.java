package org.algorithms.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// WAP to find the height/depth of a Binary Tree(might be incomplete binary tree i.e. having
// holes in array representation). Tree with only one node has height 1.
public class Height {
    public static void main(String[] args) {
        // Creating a binary tree
        BinaryTree binaryTree = new BinaryTree(new BinaryTreeNode(1));

        // Adding nodes
//        binaryTree.root.left = new BinaryTreeNode(2);
//        binaryTree.root.right = new BinaryTreeNode(3);
//        binaryTree.root.left.left = new BinaryTreeNode(4);
//        binaryTree.root.left.right = new BinaryTreeNode(5);
//        binaryTree.root.right.left = new BinaryTreeNode(6);
//        binaryTree.root.right.right = new BinaryTreeNode(7);
//        binaryTree.root.right.right.left = new BinaryTreeNode(8);

        Height height = new Height();
        System.out.println("Recursively: " + height.findHeightRecursively(binaryTree.root));
        System.out.println("Non-recursively: " + height.findHeightNonRecursively(binaryTree.root));
        System.out.println("Using Level-order: " + height.findHeightUsingLevelOrder(binaryTree.root));
    }

    public int findHeightRecursively(BinaryTreeNode node){
        int height = 0;
        if(node != null){
            int left = findHeightRecursively(node.left);
            int right = findHeightRecursively(node.right);

            height = Math.max(left,right) + 1;
        }
        return height;
    }

//    uses post-order traversal and tracks stack size(easy approach)
    public int findHeightNonRecursively(BinaryTreeNode node){
        int maxHeight = 0;
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode previous = null;
        do{
            while (node != null){
                stack.push(node);
                node = node.left;
            }

            while (node == null && !stack.isEmpty()){
                node = stack.peek();
                if(node.right == null || node.right == previous){
                    maxHeight = Math.max(maxHeight, stack.size());
                    stack.pop();
                    previous = node;
                    node = null;
                }else{
                    node = node.right;
                }
            }
        }while (!stack.isEmpty());
        return maxHeight;
    }

//    we can also use level-order traversal and push null into queue for
//      each level(bit complex, present in Karumanchi)
    public int findHeightUsingLevelOrder(BinaryTreeNode node){
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        int level = 0;

        if(node != null){
            queue.add(node);
            queue.add(null);

            while (!queue.isEmpty()){
                node = queue.poll();
                if(node == null){
                    if(!queue.isEmpty()){
                        queue.add(null);
                    }
                    level++;
                }else{
                    if(node.left != null)
                        queue.add(node.left);

                    if(node.right != null){
                        queue.add(node.right);
                    }
                }
            }
        }
        return level;
    }
}
