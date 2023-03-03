package hardwork;

public class ChildMethod extends MethodAbstract {
	@Override
	public void bodycolour() {
		// TODO Auto-generated method stub
		System.out.println("Red");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChildMethod ch = new ChildMethod();
      ch.bodycolour();
      ch.aircraft();
	}
}