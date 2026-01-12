package StreamConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lengthgrtr6Smaller8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str=Arrays.asList("cap","testerrrr","mangoo3","test112");
		List<String> str1=new ArrayList<String>();
		str1=str.stream().filter(s->s.length()>6&&s.length()<8).collect(Collectors.toList());
		System.out.println(str1);

	}

}
