import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, World!");
            writer.close();

            // Reading from a file
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println("Read from file: " + line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}