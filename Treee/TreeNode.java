package Treee;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public void insert(int value) {
//        DONT ALLOW DUPLICATES
        if(value == data) {
            return;
        }
        if(value < data) {
            if(left == null) {
               left = new TreeNode(value);
            }else {
                left.insert(value);
            }
        }
        if(value > data) {
            if(right == null) {
                right = new TreeNode(value);
            }else {
                right.insert(value);
            }
        }
    }

//    Performing inorder traversal for the node
    public void inorder() {
       if(left != null) {
            left.inorder();
       }
        System.out.print(data + ",");
       if(right != null) {
           right.inorder();
       }
    }

//    Performing the preorder traversal for the node
    public void preorder() {
        System.out.print(data + ",");
        if(left != null)  left.preorder();
        if(right != null) right.preorder();
    }

//    Performing the postorder traversal for the node
    public void postorder() {
        if(left != null) left.postorder();
        if(right != null) right.postorder();
        System.out.print(data + ",");
    }


    public TreeNode(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
