/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

import java.util.ArrayList;

/**
 *
 * @author sid
 */
public class BinaryTreeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TreeNode.debug = true; //to debug
        BinaryTree<Double> tree1 = new BinaryTree<>(Double.class);
        //BinaryTree tree2 = new BinaryTree(Integer.class,0); //not type safe
        TreeNode<Double> n1 = new TreeNode<>(3.0);
        //TreeNode n2 = new TreeNode(1); //not type safe
        n1.insert(4.0);
        n1.insert(5.0);
        
        tree1.insert(1.0);
        tree1.insert(2.0);
        
        TreeNode<Double> n2 = tree1.search(3.0);
        if(n2 == null)
            System.out.println("Element not found");
        else
            System.out.println("Element found: " + n2);
        
        System.out.println("Before adding sub-tree: " + tree1);
        tree1.insert(n1);
        
        System.out.println("After adding sub-tree: " + tree1);
        n2 = tree1.search(3.0);
        
        if(n2 == null)
            System.out.println("Element not found");
        else
            System.out.println("Element found: " + n2.getData());   
        
        //BinaryTree<BinaryTree<Integer>> treeOfTrees;   
        //ArrayList<ArrayList<Integer>> listOfLists;
        
    }
    
}
