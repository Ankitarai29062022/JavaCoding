package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdrdHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {5,8,6,9,3,5,7};
		List<Integer> lt=Arrays.asList(arr);
		lt.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);

	}

}
