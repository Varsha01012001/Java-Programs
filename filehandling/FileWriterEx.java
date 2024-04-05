package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("C:\\java1\\xyz.txt",true);
		writer.write("File writer example");
		writer.close();
	}

}
