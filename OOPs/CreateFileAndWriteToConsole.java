import java.io.*;

class CreateFileAndWriteToConsole {

    public static void main(String[] args) {
        try {
            // Part 1: Writing to the file
            FileWriter fw = new FileWriter("abc.txt"); // Creating a FileWriter object to create a new file
            fw.write("Once upon a time......"); // write() method will write the string in the file
            fw.close(); // Closing the file
            
            System.out.println("\n File written ");
            
            // Part 2: Reading from the file
            char c;
            FileReader fr = new FileReader("abc.txt");
            BufferedReader in = new BufferedReader(fr);
            
            String line = in.readLine();
            
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
            
            in.close();
            fr.close();
            
        } catch (IOException e) {
            System.out.println(" There are some IOException ");
        }
    }
}