package oops.ObjectSerialization;
import java.io.ObjectInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.io.IOException;
import java.io.FileInputStream;


public class DeserializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = null;
        // now deserialize the file into object
        Path currentProjectPath =  FileSystems.getDefault().getPath("");            
        String absolutePath = currentProjectPath.toAbsolutePath().toString();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(absolutePath + "/src/oops/ObjectSerialization/data.txt"));
        emp = (Employee) in.readObject();
        System.out.println("Employee id = " + emp.employee_id);
        System.out.println("Employee name = " + emp.employee_name);
        System.out.println("Employee address = " + emp.employee_address);      
    }
    
}
