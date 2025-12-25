package CodePractice;

import java.util.Scanner;

public class FactUsingRecursion {
	int fact=1;
	
public static void main(String args[]) { 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no");
	int no=sc.nextInt();
	FactUsingRecursion fr=new FactUsingRecursion();
	System.out.println(fr.rec(no));
	

}

public int rec(int no) {
	if(no>1) {

	fact=fact*no;
	rec(no-1);
	
}
	return fact;}

}