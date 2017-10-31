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
public class BinaryTree {

    BinaryTreeNode root;

    //Method isEmpty 
    public boolean isEmpty() {
        return (root == null);
    }

    public void preOrder(){
        preOrder(root);
    }
    
    public void inOrder(){
        inOrder(root);
    }
    
    public void postOrder(){
        postOrder(root);
    }
    
    public static void visit(BinaryTreeNode t) {
        System.out.print(t.element + " ");
    }

    public static void preOrder(BinaryTreeNode t) {
        if (t != null) {
            visit(t); //Visit Tree t
            preOrder(t.leftChild); //Do Left SubTree
            preOrder(t.rightChild); //Do Right SubTree
        }
    }

    public static void inOrder(BinaryTreeNode t) {
        if (t != null) {
            inOrder(t.leftChild); //Do Left SubTree
            visit(t); //Visit Tree t
            inOrder(t.rightChild); //Do Right SubTree
        }
    }

    public static void postOrder(BinaryTreeNode t) {
        if (t != null) {
            postOrder(t.leftChild); //Do Left SubTree
            postOrder(t.rightChild); //Do Right SubTree
            visit(t); //Visit Tree t
        }
    }

    public static void infix(BinaryTreeNode t){
        if (t != null) {
            System.out.print("(");
            infix(t.getLeftChild()); //Output Left Operand
            System.out.print(t); //Output Operator
            infix(t.getRightChild()); //Output Right Operand
            System.out.println(")");
        }
    }
    
    public static void leverOrder(BinaryTreeNode t){
        ArrayQueue q = new ArrayQueue();
        while (t != null)
        {
            visit(t); //Visit Tree t
            
            //Put t's Children on Queue
            if(t.leftChild != null)
                q.put(t.leftChild);
            if(t.rightChild != null)
                q.put(t.rightChild);
            
            //Get Next Node to Visit
            t = (BinaryTreeNode) q.remove();
        }
    }
}
