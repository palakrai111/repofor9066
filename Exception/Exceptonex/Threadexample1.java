package Exceptonex;

public class Threadexample1 extends Thread
{
     public void run()
     {
    	 for(int i = 0; i <10; i++)
    	 {
    		 System.out.println(Thread.currentThread().getName()+i);
    		 System.out.println(Thread.currentThread().getPriority());
    		try {
    		 Thread.sleep(3000);
    		}catch(InterruptedException e)
    		{
    			System.out.println(e);
    		}
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadexample1 t1 = new Threadexample1();
		t1.setPriority(MAX_PRIORITY);
		t1.setName("palak");
		t1.start();
		Threadexample1 t2 = new Threadexample1();
		t2.setPriority(MIN_PRIORITY);
		t2.setName("gaurik");
		t2.start();

	}

}
