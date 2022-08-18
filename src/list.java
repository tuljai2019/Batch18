import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> x=new ArrayList<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(20);
		x.add(null);
		x.add(null);
		x.remove(2);
		for(int i=0;i<x.size();i++) {
			System.out.println(x.get(i));
		}
	}

}
