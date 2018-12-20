package BinaryTrees;

public class BSTClient {

    public static void main(String[] args) {
        int []arr = {12,24,35,50,74,93,104};
        BST bst = new BST(arr);
        bst.display();
        System.out.println(bst.find(62));
        System.out.println(bst.max());
        System.out.println(bst.min());
//        bst.printAllInRange(22,60);
        bst.addElement(20);
        bst.removeElement(12);
        bst.display();
    }


}
