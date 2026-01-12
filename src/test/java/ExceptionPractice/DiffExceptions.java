package ExceptionPractice;

import org.testng.annotations.Test;

public class DiffExceptions {
	
	@Test
	public void Exceptn() {
		
		//===========NoFormatException=============
		
//		String s1="abc";
//		int b=Integer.parseInt(s1);
//		System.out.println(b);
//		
//		
		//=======================================
		try {
		int a=50/0;
	}
		catch(Exception e){
			e.printStackTrace();
			}
		finally {
			System.out.println("Arithmetic Exceptn");
		}
		//=============================================
//		try {
//			String s = null;
//			System.out.println(s.length());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		}

}
