package StreamConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str=Arrays.asList("test",null,"Anks");
		List<String> str1=new ArrayList<>();
		str1=str.stream().filter(n->n!=null).collect(Collectors.toList());
		System.out.println(str1);

	}

}
