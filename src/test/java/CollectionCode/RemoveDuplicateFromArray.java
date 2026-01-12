package CollectionCode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,3,3,3,6,5,8,7,6};
		Set<Integer> st=new LinkedHashSet<Integer>();
		for(int a:arr) {
			st.add(a);
		}
		System.out.println(st);

	}

}
