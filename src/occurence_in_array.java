
public class occurence_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,5,6,2,4,4,51,3,5,4,5,2};
		int b=4;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				count++;
			}
		}
		System.out.println(count);
	}

}
