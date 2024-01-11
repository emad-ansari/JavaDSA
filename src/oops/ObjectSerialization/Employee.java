package oops.ObjectSerialization;
import java.io.Serializable;

public class Employee implements Serializable{
    int employee_id;
    String employee_name;
    String employee_address;

    public Employee(int id, String name, String address){
        this.employee_id = id;
        this.employee_name = name;
        this.employee_address = address;
    }
    

    

    
}
