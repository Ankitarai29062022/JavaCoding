package CollectionCode;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,6,9,8};
		boolean status=true;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>arr[i+1]) {
			System.out.println("Not sorted");
			status =false;
			break;
		}
		}
		
		System.out.println(status);
	}

}
