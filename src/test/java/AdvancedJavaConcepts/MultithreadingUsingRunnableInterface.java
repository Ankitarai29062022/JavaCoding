package AdvancedJavaConcepts;

public class MultithreadingUsingRunnableInterface implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Thread t1=new Thread(new MultithreadingUsingRunnableInterface());
	t1.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("multi");
		
	}

}
