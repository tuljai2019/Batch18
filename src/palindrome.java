
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="sos";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equals(b)) {
			System.out.println("this is palindrome");
		}else {
			System.out.println("this is not palindrome");
		}
	}

}
