package hardwork;

public class MethodOverridingChildClass extends MethodOverridingParentClass{
	public void myMethod(){
		System.out.println("I am a method from Child Class");
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingParentClass obj = new MethodOverridingChildClass();
		// It calls the child class method myMethod()
		obj.myMethod();
		}
		}
	


