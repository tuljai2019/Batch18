
public class reverse_string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string="abcdefghijklmnopqrstuvwxyz";
		String reverse="";
		int count=0;
		
		for(int i=string.length()-1;i>=0;i--) {
			reverse=reverse+string.charAt(i);
			count++;
		}
		System.out.println(reverse+" "+ count);
	}

}
