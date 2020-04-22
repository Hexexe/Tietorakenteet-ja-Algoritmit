/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tehtävä_8_BinaryTree;

/**
 *
 * @author kamaj
 */
public class Node {
    private String data;
    private BinaryTree left;
    private BinaryTree right;

    public Node(String value) {
        data = value;
        left = right = null;
    }
    public Node (String value, BinaryTree left, BinaryTree right) {
        data = value;
        this.left = left;
        this.right = right;
    }
    public String getData() {
        return data;
    }
    public BinaryTree left() {
        return left;
    }
    public BinaryTree right() {
        return right;
    }
    public void setLeft(BinaryTree tree) {
        left = tree;
    }
    public void setRight(BinaryTree tree) {
        right = tree;
    }

    @Override
    public String toString() { return data; }
}
