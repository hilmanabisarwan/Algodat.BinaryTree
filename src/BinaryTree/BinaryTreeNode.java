/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author Windows 8
 */
public class BinaryTreeNode {
    //Package Visible Data Members
    Object element;
    BinaryTreeNode leftChild; //Left SubTree
    BinaryTreeNode rightChild; //Right SubTree

    //Constructors
    public BinaryTreeNode() {
    }
    
    public BinaryTreeNode(Object theElement, BinaryTreeNode theLeftChild, BinaryTreeNode theRightChild) {
        theElement = element;
        theLeftChild = leftChild;
        theRightChild = rightChild;
    }

    //Setter & Getter
    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
   
}