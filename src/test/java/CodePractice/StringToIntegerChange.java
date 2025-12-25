package CodePractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToIntegerChange {

	public static void main(String[] args) {
		int a=5;
		String b="6";
		
		int c=a+Integer.parseInt(b);
System.out.println(c);
StringToIntegerChange y=new StringToIntegerChange();
y.IntegerToString();

Date d=new Date();
SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyy");
System.out.println(fm.format(d));

	}
	
	public void IntegerToString() {
		int a=6;
		int b=8;
		String m=Integer.toString(6);
		String n=String.valueOf(8);
		System.out.println(m+n);
	}

}
