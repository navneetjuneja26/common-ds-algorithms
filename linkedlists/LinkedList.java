package linkedlists;

public class LinkedList {
    /* How a node should look like*/
    private class Node {
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }
    void display() {
        for(Node temp=head;temp != null;temp=temp.next) {
            System.out.print(temp.data + " ");
        }
        System.out.println(" ");
    }
    void handleZeroSize(int value) {
        Node temp = new Node();
        temp.data = value;
        head = temp;
        tail = temp;
        this.head = temp;
        size++;
    }
    void addFirst(int value) {
            if(size == 0) {
                handleZeroSize(value);
                return;
            }
            Node node = new Node();
            node.data = value;
            node.next = head;
            this.head = node;
            size++;
    }
    void addLast(int value) {
        if(size == 0) {
            handleZeroSize(value);
            return;
        }
        Node node = new Node();
        node.data = value;
        this.tail.next = node;
        this.tail = node;
        size++;
    }
    int getFirst() {
        return head.data;
    }
    int getLast() {
        return tail.data;
    }
    int getAt(int idx) {
        // Out of the bounds check
        if(size < 0 || idx >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }
        Node ptr = head;
        for (int i=0;i<idx;i++) {
            ptr = ptr.next;
        }
        return ptr.data;
    }
    private Node getNodeAt(int idx) {
        //Out of bounds check
        if (size < 0 || idx >= size) {
            System.out.println("Index out of bounds");
            return null;
        }
        Node node = head;
        for(int i=0;i<idx;i++) {
            node = node.next;
        }
        return node;
    }
    void addAt(int value, int idx) {
        //out of bounds case
        if(size < 0 || idx >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if(idx == 0) {
            addFirst(value);
        }
        Node node = new Node();
        node.data = value;
        Node prevNode = getNodeAt(idx-1);
        node.next = prevNode.next;
        prevNode.next = node;
    }
    public int handleOneSize() {
        int temp = head.data;
        head = tail = null;
        size = 0;
        return temp;
    }
    int removeFirst() {
        if(size == 0) {
            System.out.println("underflow");
            return -1;
        }else if(size == 1) {
            return handleOneSize();
        } else {
            Node temp = head;
            head = temp.next;
            return temp.data;
        }
    }
    int removeLast() {
        if(size == 0) {
            System.out.println("underflow");
            return -1;
        }else if(size == 1) {
            return handleOneSize();
        }else {
            Node temp = tail;
            Node prevNode = getNodeAt(size - 2);
            tail = prevNode;
            return temp.data;
        }
    }
    int removeAt(int idx) {
        //out of bounds check
        if(size < 0 || idx >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }else if(size == 0) {
            //underflow check
            System.out.println("Underflow");
            return -1;
        }else if(size == 1) {
            return handleOneSize();
        }else {
            Node temp = getNodeAt(idx - 1);
            Node i = temp.next;
            Node ip = i.next;
            temp.next = ip;
            return i.data;
        }
    }
    public void reverseListIteratively() {
        //It is just like arrays
        //Iterate till half the size
        for (int i=0;i<size/2;i++) {
            Node f = getNodeAt(i);
            Node l = getNodeAt(size-1-i);
            int temp = f.data;
            f.data = l.data;
            l.data = temp;
        }
    }
    public void reversePointerIterative() {
        Node prev = null;
        Node ptr = head;
        while(ptr != null) {
            Node oc = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = oc;
        }
        Node t = head;
        head = tail;
        tail = t;
    }
//    More utility methods to reverse the linkedlist
     public void displayReverse() {
        recursiveReverse(head);
     }
     private void recursiveReverse(Node node) {
        if(node == null) return;
        recursiveReverse(node.next);
         System.out.println(node.data + " ");
     }

//     Reverse pointer recursive
    public void reversePointerRecursive() {
        reversePointerRecursive(head);
        Node temp = head;
        head = tail;
        tail = temp;
        tail.next = null;
    }
    private void reversePointerRecursive(Node curr) {
        if(curr.next == null) return;
        reversePointerRecursive(curr.next);
        curr.next.next = curr;
    }
//    Reverse data recursively
    private class heapMover {
        Node node;
    }
    public void reverseDataRecursively() {
        heapMover left = new heapMover();
        left.node = this.head;
        reverseDataRecursively(left,head,0);
    }
    private void reverseDataRecursively(heapMover left,Node right,int counter){
            if(right == null)
                    return;
            reverseDataRecursively(left,right.next,counter+1);
            if(counter>=size/2) {
                int t = left.node.data;
                left.node.data = right.data;
                right.data = t;
                left.node = left.node.next;
            }
    }
    public void fold() {
        heapMover left = new heapMover();
        left.node = this.head;
        fold(left,head,0);
    }
    private void fold(heapMover left,Node right,int counter) {
        if(right == null) return;
        fold(left,right.next,counter+1);
        if(counter> size/2) {
            Node ocnext = left.node.next;
            left.node.next = right;
            right.next= ocnext;
            left.node = ocnext;
        }else if(counter == size/2) {
            tail = right;
            tail.next = null;
        }
    }
    public boolean isPalindrome() {
        heapMover left = new heapMover();
        left.node = this.head;
        return isPalindrome(left,head,0);
    }
    private boolean isPalindrome(heapMover left,Node right,int counter) {
        if(right == null) return true;
        boolean f = isPalindrome(left,right.next,counter+1);
        if(counter >= size/2){
            if(left.node.data != right.data) {
                left.node = left.node.next;
                return f=false;
            }
            left.node = left.node.next;
        }
        return f;
    }
//    Finding the middle element of the linkedlist
    public int mid() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            //increment the slow pointer by 1
            slow =slow.next;
            //increment the fast pointer by 2
            fast = fast.next.next;
        }
        return slow.data;
    }





}
