package ArrayCode;

public class MaxValueFromArray1 {

	public static void main(String[] args) {
		int arr[]= {7,9,3,6,5,3,2};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
			
		}
		
		System.out.println(max);
		

	}

}
