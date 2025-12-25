package CodePractice;

public class StaticNonstatic {

        public static int staticCount = 0;  //Shared across all instances 
		public int nonStaticCount = 0; // Unique per instance 
		public static void incrementStatic()
		{
			staticCount++; 
			System.out.println(staticCount);
		}
		public void incrementNonStatic() 
		{ 
			nonStaticCount++; 
			System.out.println(nonStaticCount);
		}
		
public static void main(String[] args) {
	StaticNonstatic c1 = new StaticNonstatic();
	StaticNonstatic c2 = new StaticNonstatic(); 
	StaticNonstatic c3 = new StaticNonstatic(); 
	c1.incrementStatic(); // staticCount = 1 
	c1.incrementStatic();
	
	c1.incrementNonStatic(); // c1.nonStaticCount = 1 
	c2.incrementNonStatic(); // c2.nonStaticCount = 1 (independent values)
	c3.incrementNonStatic();

	}

}
