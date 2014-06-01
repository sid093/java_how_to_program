/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sid
 */
public class BinaryTree <T extends Comparable<T>> implements Comparable{
    private TreeNode<T> root;
    private Class classType;
    public static boolean debug = false;
    
    public BinaryTree(Object type)
    {
        classType = (Class) type;
        if(debug)
            System.out.println(classType.getName());
        //root = new TreeNode<T>(value);
        //System.out.println(root.getClass().getName());
        root = null;
    }
    
    public void insert(T value)
    {
        if(classType.isAssignableFrom(value.getClass()))
        {
            if(root == null)
                root = new TreeNode<>(value);
            else
                root.insert(value);
        }
        else
            System.out.println("Error trying to insert " + value.getClass().getName() + " in a " + classType.getName() + " tree");
    }
    
    public void insert(TreeNode<T> node)
    {
        root.insert(node);
    }
    
    public Class getClassType()
    {
        return classType;
    }
    
    public TreeNode<T> search(T searchTerm)
    {
        return root.search(searchTerm);       
    }
    
    @Override
    public String toString()
    {
        return root.toString();
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class TreeNode <T extends Comparable <T>> implements Comparable<TreeNode> {
    private TreeNode<T> leftNode;
    private T data;
    private TreeNode<T> rightNode;
    private Class classType;
    public static boolean debug = false;
    
    public TreeNode(T value)
    {
        data = value;
        leftNode = rightNode = null;
        if(debug)
            System.out.println("Created node with data: " + value);
        classType = data.getClass();
    }
    
    public void insert(T value)
    {        
        if(value.compareTo(data) > 0)
        {
            if(rightNode == null)
            {
                rightNode = new TreeNode<T>(value);
                if(debug)
                    System.out.println("Inserting " + value);
            }
            else
            {
                rightNode.insert(value);
            }
        }
        else
        {
            if(leftNode == null)
            {
                leftNode = new TreeNode<T>(value);
                if(debug)
                    System.out.println("Inserting " + value);
            }
            else
            {
                leftNode.insert(value);
            }
        }
        
    }
    
    public void insert(TreeNode<T> node)
    {
        for(T element : node.getList())
            insert(element);
    }
    
    private void getListHelper(TreeNode<T> node, List<T> sortedArray)
    {
        if(node == null)
            return;
        getListHelper(node.leftNode, sortedArray);
        sortedArray.add(node.getData());
        getListHelper(node.rightNode, sortedArray);
    }
    /*
    public T[] getArray()
    {
        List<T> sortedArray = new ArrayList<T>();
        getArrayHelper(this, sortedArray);
        System.out.println(sortedArray);
        return (T[])sortedArray.toArray(Array.newInstance(classType, sortedArray.size()));
    }
    */
    public List <T> getList()
    {
        List<T> sortedArray = new ArrayList<T>();
        getListHelper(this,sortedArray);
        return sortedArray;
    }
    
    private TreeNode<T> searchHelper(TreeNode<T> node, T searchTerm)
    {
        
        if(node == null)
        {
            if(debug)
                System.out.println("Element " + searchTerm + " not found!");
            return null;
        }
        
        if(debug)
            System.out.println("Searching against " + node.getData());
        if(node.getData().equals(searchTerm))
        {
            if(debug)
                System.out.println("Element " + searchTerm + " found!");
            return node;
        }
        else if(node.getData().compareTo(searchTerm) > 0)
            return searchHelper(node.leftNode, searchTerm);
        else
            return searchHelper(node.rightNode, searchTerm);
    }
    
    public TreeNode<T> search(T searchTerm)
    {
        return searchHelper(this, searchTerm);
    }
    
    @Override
    public String toString()
    {
        List<T> sortedArray = getList();
        String output = "";
        for(T element : sortedArray)
            output = output + element + '\t';
        return output;
    }
    
    public T getData()
    {
        return data;
    }

    @Override
    public int compareTo(TreeNode o) {
        return data.compareTo((T)o.getData());        
    }
    
}
