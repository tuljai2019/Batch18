
public class searchNumber_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {3,3,2,1,6,4,2,3,4,};
		int b=5;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(b==a[i]) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("number is found");
		}
		else {
			System.out.println("number is not found");
		}
	}

}
