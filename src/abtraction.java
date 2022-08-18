



abstract class  math{
	public math() {
		System.out.println("this is cunstructor....");
	}
	public void add() {
		System.out.println("this is addition");
	}
	public abstract void substraction();

}
class operation extends math{
	public void operation1() {
		
	}

	@Override
	public void substraction() {
		// TODO Auto-generated method stub
		System.out.println("this is substraction...");
	}
}

public class abtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		operation o=new operation();
		o.add();
		o.substraction();
		
	}

}
