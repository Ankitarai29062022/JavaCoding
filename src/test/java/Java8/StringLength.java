package Java8;

import java.util.Arrays;
import java.util.List;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str=Arrays.asList("test","fgt","erree","Anks");
		
		str.stream().map(s->s.length()).forEach(System.out::println);
		

	}

}
