
public class reverse_string_by_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="mahesh bhaise";
		String mainrev="";
		String arry[]=a.split(" ");
		for(int i=0;i<arry.length;i++) {
			String rev="";
			String x=arry[i];
			for(int j=x.length()-1;j>=0;j--) {
				rev=rev+x.charAt(j);
			}
			mainrev=mainrev+" "+rev;
		}
		System.out.println(mainrev);
	}

}
