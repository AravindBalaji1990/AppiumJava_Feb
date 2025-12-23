package filesdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferRaderWriterExample2 {

	public static void main(String[] args) {
		try {
            //default size 8kB - 8192 characters
			BufferedReader br = new BufferedReader(new FileReader(
					"/Users/aravindbalaji/Documents/eclipse-workspace/Java_File/testData/testdata.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"/Users/aravindbalaji/Documents/eclipse-workspace/Java_File/writetext/TestChange_converted.txt"));
			char[] buffer = new char[8192];// limits the write to 8kb
            int charsread = br.read(buffer);
            if(charsread !=-1){
                bw.write(buffer,0,charsread);
            }
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}