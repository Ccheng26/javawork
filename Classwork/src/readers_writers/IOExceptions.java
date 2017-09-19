package readers_writers;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOExceptions {
	public static void main(String[] args) {
		FileReader inputStream=null;
		FileWriter outputStream=null;
		try {
			throw new IOException ("This is an error message");
//		} catch(FileNotFoundException e) {
//			System.out.println("File not found" + e.getMessage());
//		} catch (EOFException e) {
//			System.out.println("End of file reached: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("General I/O exception: "+e.getMessage());
			e.printStackTrace();
		}
	}
}
