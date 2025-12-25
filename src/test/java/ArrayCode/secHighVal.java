package ArrayCode;

public class secHighVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {499,2,499,6,8,433,3,0};
	   int max=arr[0];
		int secmax=arr[1];
		
		if(arr[0]>arr[1]) {
			max=arr[0];
		}
		else {
			max=arr[1];
			secmax=arr[1];
		}
		
		for(int i=2;i<arr.length;i++) {
			
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
				
			}
			else if(arr[i]>secmax &&arr[i]<max) {
				secmax=arr[i];
			}
			
			System.out.println("conflict check");
		}
System.out.println(secmax);
System.out.println(Integer.MIN_VALUE);
	}

}
