import java.util.HashMap;
import java.util.Map;

public class mapMobno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> mp=new HashMap<String,String>();
		mp.put("Sam", "9123669033");
		mp.put("Jam", "9123669034");
		mp.put("Tam", "9123669033");
		
		System.out.println(mp);
		
		mp.put("Jam", "9123669039");
		System.out.println(mp);
		mp.remove("Tam");
		System.out.println(mp);

	}
	

}
