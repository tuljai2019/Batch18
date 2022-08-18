
public class count_vowel_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="mahesh bhaise";
		int count=0;
		for(int i=0;i<a.length();i++) {
			Character c=a.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count=count+1;
			}
		}
		System.out.println("count of vowel is "+count);
	}

}
