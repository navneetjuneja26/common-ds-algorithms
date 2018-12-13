import java.util.List;
import java.util.Vector;

public class EmployeesVector {
    public static void main(String[] args) {
        List<EmployeeVectorClass> employees = new Vector<>();
        employees.add(new EmployeeVectorClass("Prateek","Madaan",1));
        employees.add(new EmployeeVectorClass("Sumeet","Malik",2));
        employees.add(new EmployeeVectorClass("Sameer","Sharma",3));
        employees.forEach(e -> System.out.println(e + " "));
    }
}