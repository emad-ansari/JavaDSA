package college;
import java.util.ArrayList;
import java.util.Scanner;
public class SingleLevelDirectory {
    private ArrayList<String> files;

    public SingleLevelDirectory() {
        files = new ArrayList<>();
    }

    public void addFile(String fileName) {
        if (!files.contains(fileName)) {
            files.add(fileName);
            System.out.println("File " + fileName + " created.");
        } else {
            System.out.println("File " + fileName + " already exists.");
        }
    }

    public void deleteFile(String fileName) {
        if (files.contains(fileName)) {
            files.remove(fileName);
            System.out.println("File " + fileName + " deleted.");
        } else {
            System.out.println("File " + fileName + " not found.");
        }
    }

    public void listFiles() {
        if (files.isEmpty()) {
            System.out.println("No files found.");
        } else {
            System.out.println("Files:");
            for (String file : files) {
                System.out.println(file);
            }
        }
    }

    public static void main(String[] args) {
        SingleLevelDirectory directory = new SingleLevelDirectory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add File\n2. Delete File\n3. List Files\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter file name to add: ");
                    String addFileName = scanner.nextLine();
                    directory.addFile(addFileName);
                    break;
                case 2:
                    System.out.print("Enter file name to delete: ");
                    String deleteFileName = scanner.nextLine();
                    directory.deleteFile(deleteFileName);
                    break;
                case 3:
                    directory.listFiles();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
