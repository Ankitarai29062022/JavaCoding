package CollectionCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Given2Arrays_Merge {

	public static void main(String[] args) {
	Integer arr1[]= {1,8,3,7,3,2,3,10};
	
	Integer arr2[]= {1,9,3,7,4,2};
	
	ArrayList<Integer> str1=new ArrayList<Integer>(Arrays.asList(arr1));
	ArrayList<Integer>str2=new ArrayList<Integer>(Arrays.asList(arr2));
	Collections.sort(str1);
	Collections.sort(str2);
	str1.retainAll(str2);
	
	System.out.println(str1);
	

	}

}
