package BasicProgramming;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		Factorial fc=new Factorial();
		fc.findValue(no);

	}
	
	public void findValue(int no) {
		//while(no>0) {
		int fact=1;
			for(int i=1;i<=no;i++) {
			fact=fact*i;
			
		}
			System.out.println(fact);
	}
		
	

}
