package ArrayCode;

import java.util.Scanner;

public class findIndexOfArray {

	public static void main(String[] args) {
		//display index,if repeated display all index,if not present-Element not found
		int arr[]= {1,3,3,4,5,6,6,7,8,9,9};
		boolean b=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==no) {
				System.out.println(arr[i]+" ist present at position "+i);
				b=true;	
			}
			}
		if(b==false) {
			System.out.println("Element not present");
		}
		
		
	}

}
