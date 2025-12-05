import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("sample.txt");  // May throw FileNotFoundException
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine(); // May throw IOException
            System.out.println("First Line: " + line);

            br.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } 
        catch (IOException e) {
            System.out.println("Error reading file!");
        }
    }
}