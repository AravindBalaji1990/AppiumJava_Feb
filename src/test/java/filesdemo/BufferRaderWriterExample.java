package filesdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferRaderWriterExample {

	public static void main(String[] args) {
		try {
            //default size 8kB - 8192 characters
			BufferedReader br = new BufferedReader(new FileReader(
					"/Users/aravindbalaji/Documents/eclipse-workspace/Java_File/testData/testdata.txt"), 10);
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"/Users/aravindbalaji/Documents/eclipse-workspace/Java_File/writetext/TestChange_converted.txt"));
			int ch;
			while ((ch = br.read()) != -1) {
				if (Character.isLowerCase((char) ch))
					bw.write(Character.toUpperCase((char) ch));
				else
					bw.write((char) ch);
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}