package HashTable;

public class Main {
    public static void main(String[] args) {
        Employee prateek = new Employee("Prateek","Madaan",1);
        Employee sumeet = new Employee("Sumeet","Malik",2);
        Employee simran = new Employee("Simran","Arora", 3);
        Employee xyz = new Employee("XYZ","XYZ",4);
        Employee me = new Employee("me","me",5);

        SimpleHashTable sht = new SimpleHashTable();
        sht.put("Madaan",prateek);
        sht.put("Malik",sumeet);
        sht.put("Arora",simran);

        sht.printHashTable();

        System.out.println("Retrieve key Madaan "+ sht.get("Madaan"));
    }
}
