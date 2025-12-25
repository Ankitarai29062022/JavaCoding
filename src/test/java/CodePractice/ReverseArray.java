package CodePractice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {4,7,4,5,3};
		int i = 0;
		int j=arr.length-1;
		int temp = 0;
		
		while(i<j){
			temp=arr[i];
			arr[i]=	arr[j];
			arr[j]=temp;
			i++;
			j--;
					
			
		}
				
		
		System.out.println(Arrays.toString(arr));
	
		
		
	}

}
