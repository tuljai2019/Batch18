abstract class pen{
	abstract void write();
	abstract void refill();
}
class ballpen extends pen{
	void write() {
		System.out.println("writing the note....");
	}
	void refill() {
		System.out.println("refill the ink...");
	}
}

class monkey{
	void jump() {
		System.out.println("jumping...");
	}
	void bite() {
		System.out.println("biting monkey...");
	}
}

interface basicAnimal{
	void eat();
	void sleep();
}
class human extends monkey implements basicAnimal{
	void speak() {
		System.out.println("hello sir....");
	}
	
	public void eat() {
		System.out.println("eating.....");
	}
	public void sleep() {
		System.out.println("sleeping....");
	}
}


public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ballpen bp=new ballpen();
		bp.write();
		bp.refill();
		
		human h=new human();
		h.eat();
		h.sleep();
		h.jump();
		h.bite();
		h.speak();
		basicAnimal b=new human();
	}

}
