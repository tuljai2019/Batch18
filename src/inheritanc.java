interface sample{
	void method1();
	void method2();
}
interface childsample extends sample{
	void method3();
	void method4();
}
class mysample implements childsample{
	
	public void method1() {
		System.out.println("this is method 1.....");
	}
	public void method2() {
		System.out.println("this is method 2......");
	}
	public void method3() {
		System.out.println("this is method 3.....");
	}
	public void method4() {
		System.out.println("this is method 4.......");
	}
}



public class inheritanc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mysample s=new mysample();
		s.method1();
		s.method2();
		s.method3();
		s.method4();
	}

}
