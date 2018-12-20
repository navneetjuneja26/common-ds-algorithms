package Treee;

public class Tree {
    //Root of the tree
    private TreeNode root;
    public void insert(int value) {
        // Check whether the tree is empty If so insert the root node
        if(root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }

    }
    public void inorder() {
        if(root != null) {
            root.inorder();
        }
    }
    public void preorder() {
        if(root != null) {
            root.preorder();
        }
    }
    public void postorder() {
        if(root != null) {
            root.postorder();
        }
    }
    public TreeNode get(int value) {
        if(root != null) {
            return root.get(value);
        }
        return null;
    }
    public int min() {
        if(root != null) {
            return root.min();
        }else {
            return Integer.MIN_VALUE;
        }
    }
    public int max() {
        if(root != null) {
            return root.max();
        }else {
            return Integer.MAX_VALUE;
        }
    }
}
