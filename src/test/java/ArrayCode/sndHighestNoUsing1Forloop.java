package ArrayCode;

public class sndHighestNoUsing1Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,5,2,8,5,3,9};
		int fstno=Integer.MIN_VALUE;
		int sndno=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>fstno) {
				sndno=fstno;
				fstno=arr[i];
			}
			
			else if(arr[i]<fstno && arr[i]>sndno) {
				sndno=arr[i];
				
			}
			
		}
		System.out.println(fstno);
		System.out.println(sndno);

	}

}
