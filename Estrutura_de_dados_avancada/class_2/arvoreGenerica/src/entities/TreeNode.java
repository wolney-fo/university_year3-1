package entities;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    private T data;
    private TreeNode<T> parent;
    private List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    public TreeNode(T data, TreeNode<T> parent) {
        this.data = data;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public TreeNode<T> getParent() {
        return this.parent;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }

    public void removeChild(TreeNode<T> child) {
        children.remove(child);
    }

    public boolean isRoot() {
        return this.parent == null;
    }

    public boolean isLeaf() {
        return children.size() == 0;
    }

    public void printTree(TreeNode<T> node) {
        System.out.println(("  ".repeat(getNodeLevel(node))) + node.getData() + " || G=" + node.getChildren().size() + " Altura=" + getNodeHeight(node) + " Profundidade=" + getNodeDepth(node) + " Nível=" + getNodeLevel(node));
        for (TreeNode<T> child : node.getChildren()) {
            printTree(child);
        }
    }

    public TreeNode<T> searchNode(T searchData) {
        if (data.equals(searchData)) {
            return this;
        }
        for (TreeNode<T> child : children) {
            TreeNode<T> result = child.searchNode(searchData);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    public List<TreeNode<T>> getLeafNodes() {
        List<TreeNode<T>> leafNodes = new ArrayList<>();
        if (isLeaf()) {
            leafNodes.add(this);
        } else {
            for (TreeNode<T> child : children) {
                leafNodes.addAll(child.getLeafNodes());
            }
        }
        return leafNodes;
    }

    public int getHeight() {
        if (isLeaf()) {
            return 0;
        } else {
            int maxHeight = -1;
            for (TreeNode<T> child : children) {
                int height = child.getHeight();
                if (height > maxHeight) {
                    maxHeight = height;
                }
            }
            return maxHeight + 1;
        }
    }

    public int getNodeHeight(TreeNode<T> node) {
        if (this == node) {
            return getHeight();
        } else if (isLeaf()) {
            return -1;
        } else {
            int maxHeight = -1;
            for (TreeNode<T> child : children) {
                int height = child.getNodeHeight(node);
                if (height > maxHeight) {
                    maxHeight = height;
                }
            }
            return maxHeight;
        }
    }

    public int getNodeLevel(TreeNode<T> node) {
        if (this == node) {
            return 0;
        } else if (isLeaf()) {
            return -1;
        } else {
            for (TreeNode<T> child : children) {
                int level = child.getNodeLevel(node);
                if (level != -1) {
                    return level + 1;
                }
            }
            return -1;
        }
    }

    public int getNodeDepth(TreeNode<T> node) {
        return getNodeLevel(node);
    }
}