package hardwork;

public class Polyi {
	void myMethod2(int a) 
	{
		System.out.println("value of is " + a);
	}
	void myMethod2( int a, int b)
	{
		System.out.println("value of a is" +a
		+ "and value b is" +b);
	}
	void myMethod2 (String a) {
		System.out.println(a);
	}
	public static <myMethod2> void main(String[] args) {
		// TODO Auto-generated method stub
  Polyi obj = new Polyi();
  obj.myMethod2(10);
  obj.myMethod2("I am a stringl");
  obj.myMethod2(2, 6);

}
}