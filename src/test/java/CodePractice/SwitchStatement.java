package CodePractice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SwitchStatement {
	
	@Test
	//SwitchStatement dm=new SwitchStatement();
	public void day() {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case  2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case  4:
			System.out.println("Wednesday");
			break;
		default:
			break;
	}}

}
