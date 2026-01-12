package ArrayCode;

public class SortAnArraywithoutSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={9, 8, 8, 6, 4, 4, 2, 3};
	
		
		int c=0;
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
					
						
				}
				
				
			}
			
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	}

}
