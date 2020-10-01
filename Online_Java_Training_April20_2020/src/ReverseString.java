
public class ReverseString {

	public static void main(String[] args) {
		
		String str = " Dipali Mangesh Ingale";
		String[] strwords = str.split(" ");
		
		String reverse = " ";
		
		for(String W: strwords)
		{
		 
			StringBuilder sb = new StringBuilder(W);
			sb.reverse();
		
			reverse = reverse+sb.toString()+" ";
		}

		System.out.println(reverse);
	}

}
