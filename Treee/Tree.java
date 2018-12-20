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

}
