import java.util.LinkedList;

public class LinkedListClient {
    public static void main(String[] args) {
        Employee prateek = new Employee("Prateek","Madaan",1);
        Employee sumeet = new Employee("Sumeet","Malik",2);
        Employee harsh = new Employee("Harsh","Arora",3);
        Employee xyz = new Employee("x","y",4);
        EmployeeLList list = new EmployeeLList();
        list.addFirst(prateek);
        list.addFirst(sumeet);
        list.addFirst(harsh);
        list.addFirst(xyz);
        list.printList();
    }
}
