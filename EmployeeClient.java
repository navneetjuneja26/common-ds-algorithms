import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Prateek","Madaan",123));
        employees.add(new Employee("Sumeet","Malik",1));
        employees.add(new Employee("Shlok","Kapoor",12));
        employees.add(new Employee("Ujjwal","Sharma",12));
        employees.forEach(e -> System.out.println(e + " "));
        System.out.println("***************************************");
        System.out.println("O(1)" + employees.get(1));
        System.out.println("IsEmpty ? " + employees.isEmpty());
        //set in O(1)
        employees.set(2,new Employee("John","Doe",22));
        employees.forEach(e -> System.out.println(e + " "));
        System.out.println(employees.size());
        employees.add(3,new Employee("Simran","Arora",22));
        Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);
        for(Employee e : employeesArray) {
            System.out.println(e + " ");
        }
        // do alag instances hai isliye false de rha hai, overriding the equals and hashCode method
        //true milega fir
        System.out.println(employees.contains(new Employee("Simran","Arora",22)));
        System.out.println(employees.indexOf(new Employee("Prateek","Madaan",123)));
        System.out.println("**********************");
        employees.remove(2);
        employees.forEach(e -> System.out.println(e + " "));
    }
}