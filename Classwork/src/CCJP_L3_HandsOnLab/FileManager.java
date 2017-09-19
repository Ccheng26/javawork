package CCJP_L3_HandsOnLab;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.io.File;

public class FileManager {
	double bytes;
	static int addData(File f, String data) throws IOException {
		FileReader inputStream=null;
		FileWriter outputStream=null;
		if(f.exists()) {
			FileWriter fw = null;
			try {
				fw = new FileWriter(f ,true);
			} catch (IOException e) {
				e.printStackTrace();
			}    
			try {
				fw.write(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fw.close();
		}
		
		return (int)f.length();
	}


	public static void main(String args[]) {
		File f = new File("test.txt");
		
		try {
			System.out.println(addData(f, "hi hi 2"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
