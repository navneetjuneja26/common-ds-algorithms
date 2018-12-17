public class EmployeeLList {
    private EmployeeNode head;
    private int size;

    public void addFirst(Employee e) {
        EmployeeNode node = new EmployeeNode(e);
        node.setNext(head);
        head = node;
        size += 1;
    }
    public void deleteList() {
        head = null;
    }

    public Employee getNodeAt(int index) {
        if(size == 0) {
            return null;
        }
        EmployeeNode ptr = head;
        for(int i=0;i<index;i++) {
            ptr = ptr.getNext();
        }
        return ptr.getE();
    }
    public void addAt(Employee e, int index) {
        if(index == 0) {
           addFirst(e);
        }
        EmployeeNode node = new EmployeeNode(e);
        EmployeeNode preptr = null;
        EmployeeNode ptr = head;
        for(int i=0;i<index && ptr != null;i++) {
               preptr = ptr;
               ptr = ptr.getNext();
        }
        node.setNext(ptr);
        preptr.setNext(node);
    }
    public Employee removeAt(int index) {
        if(index < 0 && index >= size) {
            System.out.println("Index out of the bounds exception");
            return null;
        }
        if(index == 0) {
            removeFirst();
        }
        EmployeeNode preptr = null;
        EmployeeNode ptr = head;
        for (int i=0;i<index;i++) {
            preptr = ptr;
            ptr = ptr.getNext();
        }
        EmployeeNode removedNode = ptr;
        preptr.setNext(ptr.getNext());
        return removedNode.getE();
    }
    public EmployeeNode removeFirst() {
        if(isEmpty()){
            return null;
        }
        EmployeeNode temp = head;
        head = head.getNext();
        size -= 1;
        temp.setNext(null);
        return temp;
    }

    public EmployeeNode removeLast() {
        EmployeeNode ptr = head;
        EmployeeNode preptr = null;
        while(ptr.getNext() != null) {
            preptr = ptr;
            ptr = ptr.getNext();
        }
        EmployeeNode temp = ptr;
        if(ptr.getNext() == null) {
            preptr.setNext(null);
        }
        size -= 1;
        return temp;
    }

    public EmployeeNode getHead() {
        return head;
    }
    public int countNodes() {
        return size;
    }
//    public int countNodes() {
//        EmployeeNode ptr = head;
//        int count = 0;
//        while(ptr.getNext() != null) {
//            count++;
//            ptr = ptr.getNext();
//        }
//        return count;
//    }
//    public boolean isEmpty() {
//        int count = countNodes();
//        if(count == 0) return true;
//        return false;
//    }
//    public boolean isEmpty() {
//        return head == null;
//    }
      public boolean isEmpty() {
            return size == 0 && head == null;
        }

    public void printList() {
        EmployeeNode ptr = head;
        while(ptr != null) {
            System.out.println(ptr.getE().getFirstname() + " -> ");
            ptr = ptr.getNext();
        }
        System.out.println(".");
    }
}
