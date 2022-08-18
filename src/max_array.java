
public class max_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,2,6,5,13,1,55,1,2,3,1,2,};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
