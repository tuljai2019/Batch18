import java.util.HashMap;
import java.util.Map;

public class duplicate_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="dkcvklvniojndanvnadfkn";
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<a.length();i++) {
			Character c=a.charAt(i);
			int count=0;
			if(hm.containsKey(c)) {
				count=hm.get(c);
				hm.put(c, count+1);
			}else {
				hm.put(c, 1);
			}
		}
		for(Map.Entry m:hm.entrySet()) {
			int count=(int) m.getValue();
			if(count>1) {
				System.out.println(m);
			}
		}
		
	}

}
