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
public interface ExtendedBinaryTree {
    public boolean compareTrees(BinaryTreeNode a, BinaryTreeNode b);
    public Object clone();
    public void swapSubtrees(final BinaryTreeNode root);    
}
