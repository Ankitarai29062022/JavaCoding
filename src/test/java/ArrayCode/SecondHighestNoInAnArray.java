package ArrayCode;

public class SecondHighestNoInAnArray {

	public static void main(String[] args) {
	int arr[]= {26,8,6,9,6,5,9,5,2,9,25};
	int lar=0;
	int seclar=0;
	if(arr[0]>arr[1]) {
		lar=arr[0];
		seclar=arr[1];
	}
	else {
		lar=arr[1];
		seclar=arr[0];
		
	}
	for(int i=2;i<arr.length;i++) {
		if(arr[i]>lar) {
			seclar=lar;
			lar=arr[i];
			
		}
		else if(arr[i]>seclar) {
			seclar=arr[i];
		}
		
	}
	
	System.out.println(lar);
	System.out.println(seclar);
	
	
	

	}

}
