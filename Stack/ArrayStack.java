package Stack;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int tos;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }
    public void push(Employee e) {
        if(tos == stack.length) {
            //need to resize the backing array (worst case)
            Employee[] newArray = new Employee[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }
        tos++;
        stack[tos] = e;
    }
    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        Employee temp = stack[tos];
//        stack[tos] = null;
        tos--;
        return temp;
    }
    public boolean isEmpty() {
        return tos == -1;
    }
    public Employee peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[tos];
     }
     public int size() {
        return tos+1;
     }
     public void printStack() {
         for (int i = tos; i > 0 ; i--) {
             System.out.println(stack[i]);
         }
     }
}