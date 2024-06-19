package Exceptonex;

public class Threadexample3 implements Runnable
{
     public void run()
     {
    	 for(int i = 0; i <10; i++)
    	 {
    		 System.out.println(Thread.currentThread().getName()+i);
    		 System.out.println(Thread.currentThread().getPriority());
    		try{
    		 Thread.sleep(3000);
    		}catch(InterruptedException e)
    		{
    			System.out.println(e);
    		}
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadexample3 t1 = new Threadexample3();
		Thread x = new Thread(t1);
		x.setPriority(1);
		x.setName("palak");
		x.start();
		Threadexample3 t2 = new Threadexample3();
		Thread y = new Thread(t2);
		y.setPriority(10);
		y.setName("gaurik");
		y.start();

	}

}
