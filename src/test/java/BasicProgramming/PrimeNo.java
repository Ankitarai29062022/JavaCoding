package BasicProgramming;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println(no);
		PrimeNo pn=new PrimeNo();
		pn.primeno(no);
		

	}
	
	public void primeno(int no) {
		int temp=0;
		for(int i=2;i<no;i++) {
		if(no%i==0) {
			//System.out.println("not prime");
			temp=temp+1;
			break;
		}
		}
		if(temp>0) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("Prime");
		}
	}

}
