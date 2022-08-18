import java.util.HashMap;
import java.util.Map;

public class frequency_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="myspaceclass";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<x.length();i++) {
			Character c=x.charAt(i);
			if(hm.containsKey(c)) {
				int count=hm.get(c);
				hm.put(c, count+1);
			}else {
				hm.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> hm1:hm.entrySet()){
			System.out.println(hm1.getKey()+" "+hm1.getValue());
		}
	}

}
