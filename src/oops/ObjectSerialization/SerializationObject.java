package oops.ObjectSerialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.FileSystems;

public class SerializationObject  {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Ramesh", "downtown Canada");

        // serialize the emp object;
        try {
            Path currentProjectPath =  FileSystems.getDefault().getPath("");
            String absolutePath = currentProjectPath.toAbsolutePath().toString();
            FileOutputStream fout = new FileOutputStream(absolutePath + "/src/oops/ObjectSerialization/data.txt");

            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(emp);
            out.close();
            fout.close();
            System.out.println("emp data serialized successfully");
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        
    }
}
