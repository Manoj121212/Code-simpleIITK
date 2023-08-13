package multithreadingInJava;




public class Multi01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thr=new Thread(new ImpRunnable());
System.out.println("we are in thread"+Thread.currentThread().getName()+" before starts");

 thr.start();
 thr.setName("my first worker thread");
 
 System.out.println("we are in thread"+Thread.currentThread().getName()+" after");

	}
}

class ImpRunnable implements Runnable{
	@Override
	public void run() {
		// what ever the code that needs to be run in the thread
		
		 System.out.println("we are in thread"+Thread.currentThread().getName());

		
	}
}

