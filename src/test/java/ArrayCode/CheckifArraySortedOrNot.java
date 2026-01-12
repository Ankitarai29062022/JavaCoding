package ArrayCode;

public class CheckifArraySortedOrNot {

	public static void main(String[] args) {
	
		int arr[]= {3,5,6,7,8};
		
		
		boolean b=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				b=false;
			}
		}
		boolean a=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				a=false;
			}
		}
		System.out.println(b);
		System.out.println(a);

	}

}
