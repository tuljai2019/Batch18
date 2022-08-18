import java.util.HashMap;
import java.util.Map;

public class multiple_occurance_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="myspaceclass";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<a.length();i++) {
			Character c=a.charAt(i);
			if(hm.containsKey(c)) {
				int count=hm.get(c);
				hm.put(c, count+1);
			}else {
				hm.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> hm1:hm.entrySet()) {
			if(hm1.getValue()>1) {
				System.out.println(hm1.getKey()+" "+hm1.getValue());
			}
		}
	}

}
