
public class extract_digit_fromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="vndk489955df5f5454df65";
		String b="";
		String d="";
		for(int i=0;i<a.length();i++) {
			Character c=a.charAt(i);
			if(Character.isDigit(c)) {
				b=b+a.charAt(i);
			}else {
				d=d+a.charAt(i);
			}
		}
		System.out.println(d);
		System.out.println(b);
	}

}
