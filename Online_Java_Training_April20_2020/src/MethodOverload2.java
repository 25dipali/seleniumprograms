
public class MethodOverload2 extends MethodOverload1{
	
	public void sum(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) {
		
		MethodOverload2 mo2 = new MethodOverload2();
		mo2.sum(10, 20);
		mo2.sum(100, 200, 200);
		mo2.sum(10, 20, 30, 40);
		
	}

}
