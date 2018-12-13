package JDKImplementations;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee prateek = new Employee("Prateek","Madaan",1);
        Employee sumeet = new Employee("Sumeet","Malik",2);
        Employee simran = new Employee("Simran","Arora", 3);
        Employee xyz = new Employee("XYZ","XYZ",4);
        Employee me = new Employee("me","me",5);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(prateek);
        list.addFirst(sumeet);
        list.addFirst(simran);
        list.addFirst(xyz);

        Iterator iter = list.iterator();
        System.out.println("HEAD ->");
        while(iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <-> ");
        }
        System.out.print(".");
        list.addLast(me);           //or you may use the add method on the list
        list.removeLast();
        System.out.println();
        System.out.println("***************************");

        for(Employee e: list) {
            System.out.print(e);
            System.out.print(" <-> ");
        }
        System.out.print(".");
    }
}
