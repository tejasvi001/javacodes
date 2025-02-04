package iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("abc1.txt");
            outputStream = new FileWriter("characteroutput.txt");
            System.out.println("Hellooo");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        }catch(Exception fe) {
        	System.out.println("Sorry the file can not be found ");
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
