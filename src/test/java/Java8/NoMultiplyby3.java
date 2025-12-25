package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoMultiplyby3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]= {2,5,7,3,5};
		List<Integer> arr=Arrays.asList(2,5,7,3,5);
		List<Integer> mul=arr.stream().map(str->str*3).collect(Collectors.toList());
		System.out.println(mul);
		
		arr.stream().map(str->str*3).forEach(System.out::println);
		System.out.println(mul);
		
		

	}

}
