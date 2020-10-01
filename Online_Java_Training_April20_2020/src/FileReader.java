import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
	
		File file=new File("C:\\Program Files\\ABC.txt");
		Scanner sc = new Scanner(file);
		
		/*while(sc.hasNextLine())
		{
		System.out.println(sc.nextLine());	
		}*/
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		

	}

}
