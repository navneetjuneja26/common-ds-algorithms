package HashTable;

import java.util.Arrays;

public class SimpleHashTable {
    private Employee[] hashtable;
    public SimpleHashTable() {
        hashtable = new Employee[10];
    }
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
    public void put(String key, Employee employee) {
       int index =  hashKey(key);
       if(hashtable[index] != null) {
           System.out.println("Sorry, an employee is already sitting at that position " + index);
       }else {
           hashtable[index] = employee;
       }
     }
     public Employee get(String key) {
        int index = hashKey(key);
        return hashtable[index] != null ? hashtable[index] : null;
     }
     public void printHashTable() {
         Arrays.stream(hashtable).forEach(e -> System.out.println(e + " "));
     }
}
