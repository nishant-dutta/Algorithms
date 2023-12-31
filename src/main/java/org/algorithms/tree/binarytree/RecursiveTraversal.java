package org.algorithms.tree.binarytree;
// WAP to print all the elements in a binary tree
public class RecursiveTraversal {

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

        RecursiveTraversal recursiveTraversal = new RecursiveTraversal();

        System.out.print("Pre-Order: \t\t");
        recursiveTraversal.preOrder(binaryTree.root);
        System.out.println();

        System.out.print("Post-Order: \t");
        recursiveTraversal.postOrder(binaryTree.root);
        System.out.println();

        System.out.print("In-Order: \t\t");
        recursiveTraversal.inOrder(binaryTree.root);
        System.out.println();

//        todo: research on level order traversal recursively(if possible)

        System.out.println("Size: " + recursiveTraversal.size(binaryTree.root));
    }

    public void preOrder(BinaryTreeNode current){
        if(current != null){
            System.out.print(current.data + " ");
            preOrder(current.left);
            preOrder(current.right);
        }
    }

    public void postOrder(BinaryTreeNode current){
        if(current != null){
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.data + " ");
        }
    }

    public void inOrder(BinaryTreeNode current){
        if(current != null){
            inOrder(current.left);
            System.out.print(current.data + " ");
            inOrder(current.right);
        }
    }

    public int size(BinaryTreeNode node){
        if(node != null){
            int l = size(node.left);
            int r = size(node.right);

            return l+r+1;
        }
        return 0;
    }
}
