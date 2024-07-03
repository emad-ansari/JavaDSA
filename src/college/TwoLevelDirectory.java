package college;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

class TwoLevelDirectory {
    private HashMap<String, ArrayList<String>> userDirectories;

    public TwoLevelDirectory() {
        userDirectories = new HashMap<>();
    }

    public void addUser(String userName) {
        if (!userDirectories.containsKey(userName)) {
            userDirectories.put(userName, new ArrayList<>());
            System.out.println("User " + userName + " added.");
        } else {
            System.out.println("User " + userName + " already exists.");
        }
    }

    public void addFile(String userName, String fileName) {
        if (userDirectories.containsKey(userName)) {
            ArrayList<String> files = userDirectories.get(userName);
            if (!files.contains(fileName)) {
                files.add(fileName);
                System.out.println("File " + fileName + " created for user " + userName + ".");
            } else {
                System.out.println("File " + fileName + " already exists for user " + userName + ".");
            }
        } else {
            System.out.println("User " + userName + " does not exist.");
        }
    }

    public void deleteFile(String userName, String fileName) {
        if (userDirectories.containsKey(userName)) {
            ArrayList<String> files = userDirectories.get(userName);
            if (files.contains(fileName)) {
                files.remove(fileName);
                System.out.println("File " + fileName + " deleted for user " + userName + ".");
            } else {
                System.out.println("File " + fileName + " not found for user " + userName + ".");
            }
        } else {
            System.out.println("User " + userName + " does not exist.");
        }
    }

    public void listFiles(String userName) {
        if (userDirectories.containsKey(userName)) {
            ArrayList<String> files = userDirectories.get(userName);
            if (files.isEmpty()) {
                System.out.println("No files found for user " + userName + ".");
            } else {
                System.out.println("Files for user " + userName + ":");
                for (String file : files) {
                    System.out.println(file);
                }
            }
        } else {
            System.out.println("User " + userName + " does not exist.");
        }
    }

    public static void main(String[] args) {
        TwoLevelDirectory directory = new TwoLevelDirectory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add User\n2. Add File\n3. Delete File\n4. List Files\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter user name to add: ");
                    String addUserName = scanner.nextLine();
                    directory.addUser(addUserName);
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter file name to add: ");
                    String addFileName = scanner.nextLine();
                    directory.addFile(userName, addFileName);
                    break;
                case 3:
                    System.out.print("Enter user name: ");
                    String delUserName = scanner.nextLine();
                    System.out.print("Enter file name to delete: ");
                    String deleteFileName = scanner.nextLine();
                    directory.deleteFile(delUserName, deleteFileName);
                    break;
                case 4:
                    System.out.print("Enter user name: ");
                    String listUserName = scanner.nextLine();
                    directory.listFiles(listUserName);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
