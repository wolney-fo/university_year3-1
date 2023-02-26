package entities;

import java.util.ArrayList;
import java.util.List;

public class GenericTree<T> {

    private TreeNode<T> root;

    public GenericTree() {
        this.root = null;
    }

    public GenericTree(TreeNode<T> root) {
        this.root = root;
    }

    public TreeNode<T> getRoot() {
        return this.root;
    }

    public void printWholeTree() {
        getRoot().printTree(this.getRoot());
    }

    public void printSubTree(T element) {
        TreeNode<T> initialNode = getRoot().searchNode(element);
        if (initialNode != null) {
            initialNode.printTree(initialNode);
        } else {
            System.out.println("Node not found");
        }
    }

    public void addNode(T element, T addTo) {
        if (getRoot() == null) {
            this.root = new TreeNode<>(element);
        }
        else {
            TreeNode<T> searchNode = getRoot().searchNode(addTo);

            if (searchNode != null) {
                TreeNode<T> newNode = new TreeNode<T>(element, searchNode);
                searchNode.addChild(newNode);
            } else {
                System.out.println("Node not found");
            }
        }
    }

    public void removeNode(T element) {
        TreeNode<T> nodeToRemove = getRoot().searchNode(element);

        if (nodeToRemove != null) {
            nodeToRemove.getParent().removeChild(nodeToRemove);
        } else {
            System.out.println("Node not found");
        }
    }

    public void printLeafNodes() {
        List<TreeNode<T>> leafNodes = getRoot().getLeafNodes();
        for (TreeNode<T> leaf : leafNodes) {
            System.out.println(leaf.getData());
        }
    }
}