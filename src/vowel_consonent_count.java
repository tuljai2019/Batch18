
public class vowel_consonent_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="mahesh bhaise";
		int vowel=0;
		int con=0;
		int count=0;
		for(int i=0;i<a.length();i++) {
			Character c=a.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
			}else {
				con++;
			}
			count=vowel+con;
		}System.out.println("vowel is "+vowel+" consonent is "+con+" and total count "+count);
	}

}
