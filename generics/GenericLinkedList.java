package generics;

public class GenericLinkedList<T> {
    private class Node {
        Node next;
        T data;
    }

    private Node head;
    private Node tail;
    private int size;

    //Utility method to return the size of the linked list
    int size() {
        return size;
    }

    //   Utility method to check whether the list is empty or not
    boolean isEmpty() {
        return size == 0 ? true : false;
    }

    //    Utility method to iterate over the generic linked list
    void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    // Utility method to add the item to the start of the linked list
    void addFirst(T value) {
        //Check if the linked list is empty
        if (size == 0) {
            handleZeroSize(value);
            return;
        }
        Node node = new Node();
        node.data = value;
        node.next = head;
        this.head = node;
        size++;
    }

    //    Utility method to handle the zero size case of the linked list
    void handleZeroSize(T value) {
        Node node = new Node();
        node.data = value;
        head = node;
        tail = node;
        size++;
    }

    //    Utility method to add the node at the end of the linked list
    void addLast(T value) {
//        Check whether the linked list is empty
        if (size == 0) {
            handleZeroSize(value);
            return;
        }
        Node node = new Node();
        node.data = value;
        this.tail.next = node;
        this.tail = node;
        size++;
    }

    //    Utility method to get the first item of the linked list
    T getFirst() {
        return head.data;
    }

    //    Utility method to get the last item of the linked list
    T getLast() {
        return tail.data;
    }

    //    Utility method to get the data at a specific index
    T getAt(int index) {
        //Out of bounds check
        if (size < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return null;
        }
        Node target = head;
        for (int i = 0; i < index; i++)
            target = target.next;
        return target.data;
    }

    //    Utility method to getNodeAt at an index
    private Node getNodeAt(int index) {
//        out of bounds check
        if (size < 0 || index >= size) {
            System.out.println("Index out of bounds check");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //    Utility method to add a node at a specific index
    void addAt(T value, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node node = new Node();
            node.data = value;
            Node prevNode = getNodeAt(index - 1);
            node.next = prevNode.next;
            prevNode.next = node;
        }
    }

    T removeFirst() {
        if (size == 0) {
            System.out.println("Underflow");
            return null;
        } else if (size == 1) {
            return handleOneSize();
        } else {
            Node temp = head;
            head = temp.next;
            return temp.data;
        }
    }
    private T handleOneSize() {
        T temp = node.data;
        head = tail = null;
        size = 0;
        return temp;
    }
    T removeLast() {
        if(size == 0) {
            System.out.println("Underflow");
            return null;
        }else if(size == 1) {
            return handleOneSize();
        }else {
            Node temp = tail;
            Node prevNode = getNodeAt(size-2);
            tail = prevNode;
            return temp.data;
        }
    }
    T removeAt(int idx) {
//        Out of bounds check
        if(idx < 0 || idx >= size) {
            System.out.println("Index out of bounds check");
            return null;
        }
//        underflow
        else if(size == 0){
            System.out.println("Underflow");
            return null;
        }
//        one size removal check
        else if(size == 1) {
            return handleOneSize();
        }else {
            Node temp = getNodeAt(idx-1);
            Node t = temp.next;
            Node post_t = t.next;
            temp.next = post_t;
            return t.data;
        }
    }
}