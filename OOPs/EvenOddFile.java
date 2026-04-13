import java.io.*;

public class EvenOddFile {

    public static void main(String[] args) {
        try {
            // Initializing file readers and writers
            FileReader fr = new FileReader("integers.txt");
            BufferedReader in = new BufferedReader(fr);
            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");

            String line = in.readLine();

            // Process each line of the file
            while (line != null) {
                int num = Integer.parseInt(line);
                if (num % 2 == 0) {
                    // Write to even file if divisible by 2
                    evenWriter.write(Integer.toString(num) + "\n");
                } else {
                    // Write to odd file otherwise
                    oddWriter.write(Integer.toString(num) + "\n");
                }
                line = in.readLine();
            }

            System.out.println("Even and odd numbers copied to separate files successfully!");

            // Closing resources
            evenWriter.close();
            oddWriter.close();
            in.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}