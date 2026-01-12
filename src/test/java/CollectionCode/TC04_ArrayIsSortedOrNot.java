package CollectionCode;

public class TC04_ArrayIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,5,6,3,8};
		boolean status=false;
		
		
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				status=true;
				break;
		}
		}
		if(status==true) {
			System.out.println("Not sorted");
		}
	}

}
