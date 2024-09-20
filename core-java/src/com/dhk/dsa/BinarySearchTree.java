package com.dhk.dsa;


import java.util.Scanner;

public class BinarySearchTree {
    private static TreeNode root;

    public static void main(String[] args) {
        int value ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose below action to do  >>>>>>>>>>> ");
        printMessage();
        int command = sc.nextInt();
        switch (command){
            case 1:
                printTree();
                printMessage();
                break;
            case 2:
                System.out.println("Please enter the value to insert >>>> ");
                value = sc.nextInt();
                insertIntoTree(value);
                printTree();
                printMessage();
                break;
            case 3:
                System.out.println("Please enter value to search >>>> ");
                value = sc.nextInt();
                searchIntoTree(value);
                printTree();
                printMessage();
                break;
            case 4:
                System.out.println("Please enter the value to delete >>>> ");
                value = sc.nextInt();
                deleteFromTree(value);
                printTree();
                printMessage();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice entered. Please select option from given below.");
        }
    }

    private static void deleteFromTree(int value) {

    }

    private static void searchIntoTree(int value) {


    }

    private static void insertIntoTree(int value) {
        root = insertRecursively(root, value);
    }

    private static TreeNode insertRecursively(TreeNode root, int value) {
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = insertRecursively(root.left, value);

        }else if(value > root.data){
            root.right = insertRecursively(root.right, value);
        }
        return root;
    }

    private static void printTree(){
        inorderRecursively(root);
    }
    private static void inorderRecursively(TreeNode root) {
        if(root != null){
            inorderRecursively(root.left);
            System.out.println(root.data+" ");
            inorderRecursively(root.right);
        }else{
            System.out.println("Sorry! There is no data in the tree.");
        }
    }

    private static void printMessage(){
        System.out.println("1. Print the Binary Search Tree");
        System.out.println("2. Insert data into Binary Search Tree");
        System.out.println("3. Search data from Binary Search Tree");
        System.out.println("4. Delete data from Binary Search Tree");
        System.out.println("5. Exit the program");
    }
}
