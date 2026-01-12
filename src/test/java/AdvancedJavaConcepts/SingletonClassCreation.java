package AdvancedJavaConcepts;

public class SingletonClassCreation {
	
	private static SingletonClassCreation instance;
	
	
	private SingletonClassCreation(){
		
	}
	
	public static SingletonClassCreation getInstance() {
		if(instance==null) {
		instance=new SingletonClassCreation();
		
		
	}
		return instance;
		}
	

	

public static void main(String[] args) {
	
	System.out.println(SingletonClassCreation.getInstance());
	SingletonClassCreation ts=SingletonClassCreation.getInstance();

	SingletonClassCreation ts1=SingletonClassCreation.getInstance();

	System.out.println(ts.getInstance());
	System.out.println(ts1.getInstance());
	System.out.println(ts==ts1);
	
	
		}
}