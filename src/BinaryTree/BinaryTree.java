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
    
     public void insert(BinaryTreeNode input) {
        if (isEmpty()) {
            root = input;
        } else {
            BinaryTreeNode current = root;
            BinaryTreeNode parent = null;
            boolean diKiri = true;
                while (current != null) {
                    parent = current;
                    if (current.data < input.data) {
                        current = current.rightChild;
                        diKiri = false;
                    } 
                    else if(current.data > input.data){
                        current = current.leftChild;
                        diKiri = true;
                    }else{
                        System.out.println("data "+input.data+" sudah ada");
                        break;
                    }
                }
            if (diKiri) {
                parent.leftChild = input;
            }
            else { 
                parent.rightChild = input;
            }
        }
    }
     
    public BinaryTreeNode search(int key) {
        BinaryTreeNode node = null;
        BinaryTreeNode current = root;
        while (current != null) {
            if (current.data == key) {
                return node;
            } else {
                if (current.data < key) {
                    current = current.rightChild;
                } else {
                    current = current.leftChild;
                }
            }
        }
        return node;
    } 

    public void preOrder() {
        preOrder(root);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void postOrder() {
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

    public static void infix(BinaryTreeNode t) {
        if (t != null) {
            System.out.print("(");
            infix(t.getLeftChild()); //Output Left Operand
            System.out.print(t); //Output Operator
            infix(t.getRightChild()); //Output Right Operand
            System.out.println(")");
        }
    }

    public static BinaryTreeNode preOrderClone(BinaryTreeNode t) {
        if (t != null) {
            //NonEmpty Tree
            //Make A Clone of Root
            BinaryTreeNode ct = new BinaryTreeNode(t.element);

            //Do the Subtrees
            ct.leftChild = preOrderClone(t.leftChild);    //Clone Left Subtree
            ct.rightChild = preOrderClone(t.rightChild);  //Clone Right Subtree
            return ct;
        } else {
            return null;
        }
    }

    public static BinaryTreeNode postOrderClone(BinaryTreeNode t) {
        if (t != null) {
            //NonEmpty Tree
            //Clone LefT Subtree
            BinaryTreeNode cLeft = postOrderClone(t.leftChild);

            //Clone Right Subtree
            BinaryTreeNode cRight = postOrderClone(t.rightChild);

            //Clone Root
            return new BinaryTreeNode(t.element, cLeft, cRight);
        } else {
            return null;
        }
    }
}
