package ArrayCode;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int arr[]= {7,9,3,6,5,3,2,10};
		int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
				
			}
			if(arr[i]>smax &&arr[i]<max) {
				smax=arr[i];
				
				
			}
			
		}
		System.out.println(max);
		System.out.println(smax);
		
		
		
		
		
		

	}

}
