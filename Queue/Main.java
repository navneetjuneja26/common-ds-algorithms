package Queue;

public class Main {
    public static void main(String[] args) {
        Employee prateek = new Employee("Prateek","Madaan",1);
        Employee sumeet = new Employee("Sumeet","Malik",2);
        Employee navneet = new Employee("Navneet","Juneja",3);

        ArrayQueue q = new ArrayQueue(10);
        q.add(prateek);
        q.add(sumeet);
        q.printQueue();
        System.out.println();
        System.out.println("The node that will be removed is" + q.remove());
        q.printQueue();
        q.add(navneet);
        System.out.println();
        q.printQueue();
        System.out.println();
        System.out.println(q.peek());

    }
}
