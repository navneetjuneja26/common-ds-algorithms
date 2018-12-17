public class LinkedListClient {
    public static void main(String[] args) {
        Employee prateek = new Employee("Prateek","Madaan",1);
        Employee navneet  = new Employee("Navneet","Juneja",2);
        Employee harsh = new Employee("Harsh","Arora",3);
        Employee xyz = new Employee("x","y",4);
        Employee prince = new Employee("prince","gupta",5);
        EmployeeLList list = new EmployeeLList();
        list.addFirst(prateek);
        list.addFirst(navneet);
        list.addFirst(harsh);
        list.addFirst(xyz);
        list.printList();
        list.addFirst(prince);
        list.removeAt(1);
        System.out.println(list.getHead());
        int length_of_list =list.countNodes();
        System.out.println("Length of my list is" + length_of_list);
        boolean isListEmpty =  list.isEmpty();
        System.out.println("Is my list empty ? " + isListEmpty);
        EmployeeNode employee = list.removeFirst();
        System.out.println("Removal of the first employee" + employee);
        EmployeeNode lastNode = list.removeLast();
        System.out.println("Removal of the last employee"  + lastNode);
        list.printList();
        list.addAt(prince,2);
        list.printList();
        System.out.println(list.countNodes());
        Employee nodeAtSpecificIndex = list.getNodeAt(2);
        System.out.println(nodeAtSpecificIndex.getFirstname());
        System.out.println("*************************************");
//        list.deleteList();
        Employee emp = new Employee("Prateek","Madaan",4);
        Employee emp2 = new Employee("Krish","Krap",5);
        list.addFirst(emp);
        list.addFirst(emp2);
        list.printList();
    }
}
