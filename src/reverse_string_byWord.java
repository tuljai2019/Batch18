
public class reverse_string_byWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="abc def ghi jkl mno";
		String b="";
		String c[]=a.split(" ");
		for(int i=0;i<a.length();i++) {
			String d="";
			String e=c[i];
			for(int j=e.length()-1;j>=0;j--) {
				d=d+e.charAt(j);
				
			}
			b=b+" "+d;
		}
		System.out.println(b);
	}

}
