package iostreams;

import java.lang.Exception;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        System.out.println("Helloooo");
        try {
            in = new FileInputStream("abc.txt");
            out = new FileOutputStream("xyz.txt");
            int c;
            System.out.println("Total bytes available"+in.available());
            while ((c = in.read()) != -1) {
            	System.out.println(c);
                out.write(c);
            	}
        	} 
        	catch(Exception e){
        		System.out.println("Sorry the source file is not found");
        	}
        	finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}