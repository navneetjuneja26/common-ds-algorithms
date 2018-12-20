package Treee;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(12);
        tree.insert(20);
        tree.insert(21);
        tree.insert(7);
        tree.insert(39);
        tree.insert(29);
        tree.insert(26);
        tree.insert(43);
        tree.insert(22);
        System.out.println("Inorder Traversal(Sorted Traversal)");
        tree.inorder();
        System.out.println();
        System.out.println("Preorder Traversal");
        tree.preorder();
        System.out.println();
        System.out.println("Postorder Traversal");
        tree.postorder();
        System.out.println();
    }

}
