package ArrayCode;

public class sumOfArrayskipping3rdAnd4th {

	public static void main(String[] args) {
	int arr[] = {5,3,9,9,4,2,5};
	int sum=0;
	
	for(int i=0;i<arr.length;i++) {
		if(i==2||i==3) {
			continue;
		
	
	}
		sum=sum+arr[i];}
System.out.println(sum);
	}
}
