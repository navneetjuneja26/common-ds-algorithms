package Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int rear;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }
    public void add(Employee e) {
        if(rear == queue.length) {
            Employee[] newArray = new Employee[2*queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }
        queue[rear] = e;
        rear += 1;
    }
    public Employee remove() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front += 1;
        return employee;
    }
    public Employee peek() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }
    public int size() {
        return rear - front + 1;
    }
    public void printQueue() {
        Arrays.stream(queue).forEach(e -> System.out.print(e + " "));
    }

}
