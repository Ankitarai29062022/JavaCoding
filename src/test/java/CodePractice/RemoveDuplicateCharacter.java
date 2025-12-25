package CodePractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to find duplicate characters in a string and remove them. 
		String str="Anannnmmica";
		String nm="";
		
		StringBuilder bui=new StringBuilder();
		char[] st=str.toCharArray();
		Set<Character>s=new LinkedHashSet<Character>();
		for(char m:st) {
			s.add(m);
			
		}
		
		for(char n:s) {
			bui.append(n);
			
		}
		
		System.out.println(bui);
	
		
		

	}

}
