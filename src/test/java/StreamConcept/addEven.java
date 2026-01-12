package StreamConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class addEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int no[]= {4,2,6,8,5};
		List<Integer> arr=Arrays.asList(54,2,6,8,5);
		List<Integer> arr1=new ArrayList<Integer>();
	arr.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		
		
		
		

	}

}
