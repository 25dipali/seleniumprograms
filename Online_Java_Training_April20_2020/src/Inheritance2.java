
public class Inheritance2 extends Inheritance1 {

	String str = "Selenium";
	
	public static void main(String[] args) {
		
		Inheritance2 i2 = new Inheritance2();
		System.out.println(i2.roll);
		System.out.println(i2.str);
		i2.addition(10,  20);
		i2.substraction(10, 20);
		i2.multiplication(10, 20);
		i2.run();
	}
	public void multiplication(int x, int y)
	{
		int z;
		z=x*y;
		System.out.println("Multiplication is:"+ z);
	
    }
}