package CollectionCode;

public class FirstSecThirdElFromIntArray {

	public static void main(String[] args) {
		int arr[]= {2,5,3,7,4,5};
		
	
		int min=0;
		if(arr[0]<arr[1]) {
			
			min=arr[0];
			
			
		}
		
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
		
			min=arr[i];
		}
		
		
			
		}
	System.out.println(min);
	}
		
	
	


	

}
