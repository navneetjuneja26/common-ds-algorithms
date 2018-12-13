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
        System.out.println(list.getHead());
        int length_of_list =list.countNodes();
        System.out.println("Length of my list is" + length_of_list);
        boolean isListEmpty =  list.isEmpty();
        System.out.println("Is my list empty ? " + isListEmpty);
        EmployeeNode employee = list.removeFirst();
        System.out.println("Removal of the first employee" + employee);
        EmployeeNode lastNode = list.removeLast();
        System.out.println("Removal of the last employee"  + lastNode);
    }
}
