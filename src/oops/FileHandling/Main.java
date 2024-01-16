package oops.FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException{

        File myfile = new File("/home/emad/Downloads/Emad/desktop/Java-practice-from-scratch/src/oops/FileHandling/emad.txt");
        if (myfile.createNewFile()){
            System.out.println("file create successully " + myfile.getName());
            System.out.println("size of " + myfile.getName() + " is : " + myfile.length()); // .length() function gives the length of file 
            // .getName() function return the file name
        }
        else {
            System.out.println("file already exist");
        }
        // deleteFile(myfile);
        
        Path currentDirectory  = FileSystems.getDefault().getPath("");
        String projectPath = currentDirectory.toAbsolutePath().toString();
        // System.out.println(projectPath);

        // // create two file.
        File firstFile = new File(projectPath+ "/src/oops/FileHandling/firstFile.txt");
        File secondFile = new File(projectPath + "/src/oops/FileHandling/secondFile.txt");

        if (firstFile.exists() && secondFile.exists()){
            FileWriter writeFirstFile = new FileWriter(firstFile.getAbsolutePath());
            writeFirstFile.write("Hello my name  is Emad. ");

            FileWriter writeSecondFile = new FileWriter(secondFile.getAbsolutePath());
            writeSecondFile.write("I am a coder.");
            writeFirstFile.close();
            writeSecondFile.close();
            System.out.println("File created successfully and content written successsfully");

        }
        

        MergeFileContent obj = new MergeFileContent();
        obj.mergeFile(firstFile,  secondFile);

    }

    // private static void deleteFile(File myfile){
    //     try {
    //         myfile.delete();
    //         if (!myfile.exists()){
    //             System.out.println("file deleted successfully");
    //         }
    //     }   
    //     catch(Exception e) {
    //         System.out.println(e);
    //     }
    // }



    







}