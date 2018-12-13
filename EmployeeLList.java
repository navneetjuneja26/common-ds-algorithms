import org.w3c.dom.Node;

public class EmployeeLList {
    private EmployeeNode head;

    public void addFirst(Employee e) {
        EmployeeNode node = new EmployeeNode(e);
        node.setNext(head);
        head = node;
    }

    public EmployeeNode removeFirst() {
        EmployeeNode temp = getHead();
        head = head.getNext();
        return temp;
    }

    public EmployeeNode getHead() {
        return head;
    }
    public int countNodes() {
        EmployeeNode ptr = head;
        int count = 0;
        while(ptr.getNext() != null) {
            count++;
            ptr = ptr.getNext();
        }
        return count;
    }
    public boolean isEmpty() {
        int count = countNodes();
        if(count == 0) return true;
        return false;
    }
    public void printList() {
        EmployeeNode ptr = head;
        while(ptr != null) {
            System.out.print(ptr.getE().getFirstname() + " - > ");
            ptr = ptr.getNext();
        }
        System.out.println(".");
    }
}
