import java.util.List;
import java.util.Vector;

public class EmployeesVector {
    public static void main(String[] args) {
        List<Employee> employees = new Vector<>();
        employees.add(new Employee("Prateek","Madaan",1));
        employees.add(new Employee("Sumeet","Malik",2));
        employees.add(new Employee("Sameer","Sharma",3));
        employees.forEach(e -> System.out.println(e + " "));
    }
}