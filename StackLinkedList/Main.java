package JDKImplementations.StackLinkedList;

public class Main {
    public static void main(String[] args) {
        Employee prateek = new Employee("prateek","madaan",1);
        Employee sumeet = new Employee("sumeet","malik",2);
        Employee navneet = new Employee("navneet","juneja",3);

        LinkedStack stack = new LinkedStack();
        stack.push(prateek);
        stack.push(sumeet);
        stack.push(navneet);
        stack.printStack();
        Employee popper = stack.pop();
        System.out.println("I was popped " + popper.getFirstname());
        Employee peeker = stack.peek();
        System.out.println("I was peeked not popped " + peeker.getFirstname());
        stack.printStack();
    }

}
