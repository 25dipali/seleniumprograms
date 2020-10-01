
public class OccuranceCountofCharacters {

	public static void main(String[] args) {
		String str = "Dipali Mangesh Ingale";
		String new_str= str.toLowerCase();
		System.out.println(new_str);
		
		int totalLength= new_str.length();
		int new_length = new_str.replace("i", "").length();
		
	    int final_count = totalLength-new_length; 
	    System.out.println("Occurance of i : "+final_count);

	}

}
