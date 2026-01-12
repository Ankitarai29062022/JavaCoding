package StringQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String args[]) {
	String str="Automatiion";
	
	StringBuilder ab=new StringBuilder();
	char c[]=str.toCharArray();
	Set<Character> str1=new LinkedHashSet<Character>();
for(char m:c) {
	str1.add(m);
}

for(char n:str1) {
ab.append(n);

	}

System.out.println(ab.toString());
}
	}
