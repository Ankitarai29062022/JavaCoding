package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerToUpperMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arr=Arrays.asList("sd","asd","r","mnk");
		
		List<String> newarr=arr.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(newarr);
		
		//arr.stream().map(str->str.toUpperCase()).forEach(System.out::println);

	}

}
