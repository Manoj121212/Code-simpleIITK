package multithreadingInJava;




public class Multi02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Thread thr=new NewThread();
	//thr.run();
	thr.start();
	
	}
}

class NewThread extends Thread{
	@Override
	public void run() {
		//System.out.println("Hi this is "+Thread.currentThread().getName());
		System.out.println("hi I am from "+ this.getName());
	}
}

