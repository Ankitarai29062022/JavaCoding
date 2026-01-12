package ArrayCode;

public class MissingNoFromArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {4,5,6,7,9};
    int sum=0;
    int sum1=0;
    for(int i=0;i<arr.length;i++) {
    	sum=sum+arr[i];
    	
    }
    
    System.out.println(sum);
    for (int i=arr[0];i<=arr[arr.length-1];i++) {
    	sum1=sum1+i;
    	
	}
    System.out.println(sum1);
    System.out.println(sum-sum1);
	}

	
	

}
