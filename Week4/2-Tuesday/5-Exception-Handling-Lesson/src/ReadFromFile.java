import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {
    public static void main (String args[]) {
        String file = "./src/data.txt";
        try {
            // to open the file object
            FileReader inputFile = new FileReader(file);
            // to obtain the contents in the file
            BufferedReader bufferedReader = new BufferedReader(inputFile);
            // to get a line at a time
            String line;

            // read the file one line at a time
            // if it is not empty
            while ((line = bufferedReader.readLine())!= null ) {
                System.out.println(line);
            }

            // close the file so no one has access to the memory
            bufferedReader.close();

            // in case of an error (Exception) record the error message
            // so we can exit with 0
        } catch (Exception e) {
            // print out the error from the object e
            System.out.println("Error" + e.getMessage());
        }
    }
}
