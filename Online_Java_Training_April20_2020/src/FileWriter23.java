import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriter23{

	public static void main(String[] args) throws IOException {
		FileWriter fl=new FileWriter("D:\\Nabha.txt");
		BufferedWriter fr = new BufferedWriter(fl);
		
		fr.write("Selenium");
		fr.write("\nHello");
		
		System.out.println("Finished!!!!!");
		
		fr.close();
		
		

	}

}
