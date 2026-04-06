/*File handling is used to create, read, write, and delete files */
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;
public class Files {
public static void main(String[] args) {
        try {
            //  File create
            File file = new File("sample.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            //  Write data into file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello Jayu\n");
            writer.write("Learning Java File Handling");
            writer.close();

            System.out.println("Data written to file");

            //  Read data from file
            Scanner sc = new Scanner(file);

            System.out.println("\nReading file:");

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();

            //  Delete file
            if (file.delete()) {
                System.out.println("\nFile deleted successfully");
            } else {
                System.out.println("File deletion failed");
            }

        } catch (java.lang.Exception e) {

            System.out.println("Error occurred: " + e);

        }
    }
}
