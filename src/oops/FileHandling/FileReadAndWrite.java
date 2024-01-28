package oops.FileHandling;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileReadAndWrite {
    public static void main(String[] args) {
        try {
            Path  filePath = FileSystems.getDefault().getPath("");
            String absolutePath = filePath.toAbsolutePath().toString();
            FileWriter fw  = new FileWriter(absolutePath + "/src/oops/FileHandling/emad.txt");  
            fw.write("Hello my name is Emad. ");
            fw.append("Hello I am a coder.");

            fw.close();

            System.out.println("Content is successfully wrote in file");

            FileReader fr = new FileReader(absolutePath + "/src/oops/FileHandling/emad.txt");
            int fileCharCode = fr.read();
            while(fileCharCode != -1){
                System.out.print((char)(fileCharCode));
                fileCharCode = fr.read();
            }
            fr.close();


        }
        catch(IOException e){
            System.out.println(e);
        }
    }

}
