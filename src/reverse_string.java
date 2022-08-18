
public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="mahesh bhaise";
		String b="";
		int count=0;
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
			count=count+1;
		}
		System.out.println(b+" and string count is "+count);
	}

}
