package Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(new Employee("Prateek","Madaan",1));
        stack.push(new Employee("Sumeet","Malik",2));
        stack.push(new Employee("Shaun","Pelling",3));
        stack.push(new Employee("x","y",4));
        stack.printStack();
        System.out.println(stack.peek().getFirstname());
        System.out.println(stack.pop().getFirstname());
        System.out.println(stack.peek().getFirstname());
        System.out.println("Is my stack empty : " + stack.isEmpty());
        System.out.println("Stack size : " + stack.size());
    }
}
