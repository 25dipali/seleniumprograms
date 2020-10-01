	import java.util.*;
	public class Number_Check
	{
	public static void main(String[] args){

	int ans;
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array length: ");
	a = sc.nextInt();
	int arr[]= new int[a];
	System.out.println("Enter an array elements:");
	for (int j=0;j<a;j++)
	{
		arr[j]=sc.nextInt();
	}

	ans=processArray(arr);
	System.out.println("Numbers in array that are greater than or equal to 10 are:"+ ans);

	}
	

	public static int processArray(int arr[])
	{
		int counter = 0;
	for(int i=0;i<arr.length;i++)
	{
	  if(arr[i]>=10)
	 {
		  System.out.println("Array Value is:"+arr[i]);
	    counter++;
	 }
	}
	return counter;
	}

	}


