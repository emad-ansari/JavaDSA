package oops.ObjectSerialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.FileSystems;
/*
 * Serialization in Java is a mechanism of writing the state of an object into a byte-stream. It is mainly used in  Hibernate, RMI, JPA, EJB and JMS technologies
 * ->  The reverse operation of serialization is called deserialization where byte-stream is converted into an object. The serialization and deserialization process is platform-independent, it means you can serialize an object on one platform and deserialize it on a different platform.
 * 
 * 
 */
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
