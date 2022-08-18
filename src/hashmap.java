import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> phonecontact=new HashMap<String,Integer>();
		phonecontact.put("abc", 123);
		phonecontact.put("xyz", 123123);
		phonecontact.put("abc", 0);
		phonecontact.put(null, 1);
		phonecontact.put(null, 2);
		phonecontact.put("pqr", null);
		phonecontact.put("ab", null);
		for(Map.Entry<String,Integer> hm:phonecontact.entrySet()) {
			System.out.println(hm.getKey());
			System.out.println(hm.getValue());
		}
	}

}
