package filesdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	public static void main(String args[]) {
		CharacterStream obj = new CharacterStream();
		obj.samplefilereaderwriter();

	}

	// non-static method
	public void samplefilereaderwriter() {
		// initialising the values of FileReader and FileWriter
        // whenthe writing should happen for txt,csv,xml,json formats
        // the characters are encoded and written
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader(System.getProperty("user.dir")+"/src/test/resources/SampleInput.txt");
			out = new FileWriter(System.getProperty("user.dir") + "/src/test/resources/output_write.txt");

			int c;
			while ((c = in.read()) != -1) {
				System.out.println("the charcter data :" + c);
				out.write(c);// this will write the new file
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Executed");
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Executed");
			}
		}

	}
}
