
public class MinMAxNumber {

	public static void main(String[] args) {
		
		int [] a = {40, 22, 67,4};
		
		int min = a[0];
		
		for(int i=0; i<a.length;i++)
		{
			
			if(a[i]<min) 
			{
				
				min = a[i];	
			}
			
		}
			System.out.println("Maximum number is = "+min);
		
		}
	    

}
