package ArrayCode;

public class MissingNoFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {4,5,6,8};
    int sum=0;
    
    int totsum=0;
    for(int i=0;i<arr.length;i++) {
    sum=sum+arr[i];	

    }
    
for(int j=4;j<=8;j++) {
	totsum=totsum+j;
}
    
    System.out.println(totsum-sum);

	}

}
