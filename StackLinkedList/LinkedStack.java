package JDKImplementations.StackLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }
    public void push(Employee e) {
        stack.push(e);
    }
    public Employee pop() {
        return stack.pop();
    }
    public Employee peek() {
        return stack.peek();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public void printStack() {
        ListIterator<Employee> itr = stack.listIterator();
        System.out.println("Printing the elements of the stack");
        while(itr.hasNext()) {
            System.out.print(itr.next().getFirstname() + " ");
        }
    }
}
