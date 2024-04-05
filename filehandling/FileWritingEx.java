package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.stream.FileImageOutputStream;

public class FileWritingEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream = new FileOutputStream("C:\\java1\\abc.txt", true);
		String str = "Welcome to Edubridge!";
		byte bArr[] = str.getBytes(); // converting str - byte[] "convert string to byte file"
		outputStream.write(bArr);
		outputStream.close();
		System.out.println("File Created");

	}

}
