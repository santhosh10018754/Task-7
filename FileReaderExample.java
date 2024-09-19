package task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {

    public static void readFile(String filePath) {
        try {

            File file = new File(filePath);
            
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            

            scanner.close();
            
        } catch (FileNotFoundException e) {

            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
       
        String filePath = "C:\\Users\\admir\\eclipse-workspace\\javapractice\\src\\task7\\sa.txt"; 
        readFile(filePath);
    }
}


