
public class alternate_letter_upperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="My Space Class";
		int count=0;
		String b="";
		for(int i=0;i<a.length();i++) {
			Character c=a.charAt(i);
			if(!(c==' ')) {
				count=count+1;
				if(count%2==1) {
					b=b+Character.toLowerCase(c);
				}else {
					b=b+Character.toUpperCase(c);
				}
			}else {
				b=b+" ";
			}
		}
		System.out.println(b);
	}

}
