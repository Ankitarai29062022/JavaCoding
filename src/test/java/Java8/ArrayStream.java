package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStream {
	

	public static void main(String[] args) {
// Inputs: int[] arr1 = {1, 3, 5, 7};
//	Output	 int[] arr2 = {2, 4, 6, 8};
		int[] arr1 = {1, 3, 5, 7};
	List<Integer> st=Arrays.asList(1, 3, 5, 7);
	List<Integer> st2=st.stream().map(a->a+1).collect(Collectors.toList());
System.out.println(st2);
	}

}
