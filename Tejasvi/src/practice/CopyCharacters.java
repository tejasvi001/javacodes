package practice;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyCharacters {
	public static void main(String[] args) throws IOException {
		FileReader in=null;
		FileWriter out=null;
		System.out.println("Copy Bytes code");
		try {
			in=new FileReader("abc.txt");
			out=new FileWriter("abcCopy.txt");
			
			int c;
			while ((c = in.read()) != -1) {
				
			    out.write(c);
			    
				}
		} catch (Exception e) {
			System.out.println("Sorry the source file is not found");
			
		}
		finally {
			if(in!=null)
				in.close();
			if(out!=null)
				out.close();
		}

	}

}
