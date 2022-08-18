
public class array_evencount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {3,6,4,2,6,8,9,7};
		int even=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}
		}
		System.out.println(even);
	}

}
