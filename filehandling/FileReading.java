package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream("C:\\java1\\abc.txt");

		int i = 0;

		while ((i = inputStream.read()) != -1) {
			System.out.print((char) i);

		}
		// System.out.println("File ");
		inputStream.close();
	}

}