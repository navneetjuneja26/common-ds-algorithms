package BinaryTrees;


public class BST {
//    This is how a node will look in the BST

    private class Node {
        int data;
        Node left;
        Node right;
    }

    private int size;
    private Node root;

    public int size() {
        return this.size;
    }

    public BST(int[] a) {
        root = construct(sa, 0, sa.length - 1);
    }
//    Utility method to construct a binary search tree

    private Node construct(int[] sa, int si, int ei) {
//        Always keep in mind BST does binary search only
        if (si > ei) return null;
        int mid = (si + ei) / 2;
//      Dynamically allocate a node
        Node node = new Node();
//      Increment the size of the BST
        this.size++;
        node.data = sa[mid];
        node.left = construct(sa, si, mid - 1);
        node.right = construct(sa, mid + 1, ei);
        return node;
    }

    //   Utility method to find an element in the BST
    public boolean find(int data) {
        return find(root, data);
    }

    private boolean find(Node node, int data) {
        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        } else if (node.data < data) {
            //Recur for right subtree
            return find(node.right, data);
        } else if (node.data > data) {
            //Recur for left subtree
            return find(node.left, data);
        }
    }
//    Utility method to find the maximum element in the BST
    public int max() {
        return max(root);
    }
    private int max(Node node) {
        if(node.right == null) {
            return node.data;
        }else {
//            Recur for the right subtree
            return max(node.right);
        }
    }

//    Utility method to find the minimum element in the BST
    public int min() {
        return min(root);
    }
    public int min(Node node) {
        if(node.left == null) {
            return node.data;
        }else {
//            Recur for the left subtree
            return min(node.left);
        }
    }
//    Utility method to print the BST
    public void display(Node node) {
        if(node == null) {
            return;
        }
        String str = "";
//        Do the preorder traversal but not recursively here
        if(node.left == null) {
            str += ". <= ";
        }else {
            str += node.left.data + " <= ";
        }
        str += node.data;
        if(node.right == null) {
            str += " => .";
        }else {
            str += " => " + node.right.data;
            System.out.println(str);
            display(node.left);
            display(node.right);
        }
    }

//    Utility method to add an element to the BST
    public void addElement(int data) {
        this.root = addElement(root,data);
    }
    private Node addElement(Node node,int data) {
        if(node == null) {
//            If the tree is empty, create a new node
            node = new Node();
            node.data = data;
//            Increment the size
            this.size++;
            return node;
        }
//        If the data to be added is less than the node data, move to left
        if(node.data > data) {
            node.left = addElement(node.left,data);
        }
//        If the data to be added is more than the node data, move to the right
        if(node.data < data) {
            node.right = addElement(node.right,data);
        }
        return node;
    }

//    Utility method to remove an element from the BST
    public void removeElement(int data) {
        this.root = removeElement(root,data);
    }
    private Node removeElement(Node node,int data) {
        if(node == null) {
            return null;
        }
        if(node.data > data) {
            node.left = removeElement(node.left,data);
        }
        if(node.data < data) {
            node.right = removeElement(node.right,data);
        }else {
            if(node.left == null || node.right == null) {
                node = node.left == null ? node.right : node.left;
            }else {
                int max = this.max(node.left);
                node.data = max;
                node.left = this.removeElement(node.left,lmax);

            }
        }
        return node;
    }
}