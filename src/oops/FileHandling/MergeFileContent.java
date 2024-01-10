package oops.FileHandling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class MergeFileContent {

    public void mergeFile(File file1,  File file2){
        // first create a  third file and read the both file content and then write the content into third file
        // first get the path of two file where file is located and then in the same directory make a third file and then write
        
        try {
            
            FileWriter thirdFile = new FileWriter("/home/emad/Downloads/Emad/desktop/Java-practice-from-scratch/src/oops/FileHandling/thirdFile.txt", true);
            // read the content of file1 and file 2;
            FileReader firstFileReader = new FileReader(file1.getAbsolutePath());
            FileReader secondFileReader = new FileReader(file2.getAbsolutePath());

            int firstFileCharCode = firstFileReader.read();
            int secondFileCharCode = secondFileReader.read();

            while (firstFileCharCode != -1){
                // char fileData = (char) firstFileCharCode;
                // System.out.println(fileData);

                thirdFile.write((char) firstFileCharCode);

                firstFileCharCode = firstFileReader.read();
            }  
            
            while (secondFileCharCode != -1){
                thirdFile.write((char)secondFileCharCode);
                secondFileCharCode = secondFileReader.read();
            }  
            thirdFile.write("today is very cold");
            thirdFile.close();


            System.out.println("file merged successfully");

        }
        catch(IOException e){
            System.out.println(e);
        }

    } 
    
}
