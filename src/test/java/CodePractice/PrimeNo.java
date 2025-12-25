package CodePractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeNo {

	
	@Test
	public void prime() {
		System.out.println("Enter the no");
		int temp=0;
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				
				temp=temp+1;
				break;
			}
			
		}
		if(temp>0) {
		System.out.println("No is not prime");
		}
		else {
			System.out.println("No is prime");
		}
	}
}
