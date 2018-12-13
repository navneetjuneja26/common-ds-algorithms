import org.w3c.dom.Node;

public class EmployeeLList {
    private EmployeeNode head;

    public void addFirst(Employee e) {
        EmployeeNode node = new EmployeeNode(e);
        node.setNext(head);
        head = node;
    }
    public void printList() {
        EmployeeNode ptr = head;
        while(ptr != null) {
            System.out.print(ptr.e.getFirstname() + " - > ");
            ptr = ptr.getNext();
        }
        System.out.println(".");
    }
}
