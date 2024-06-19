package Exceptonex;

public class Threadexampe implements Runnable  
{
     public void run() 
     {
    	 for(int i = 0; i <10;i++)
    	 {
   System.out.println(Thread.currentThread().getName()+ i);
   
   /*try 
   {
	   Thread.sleep(3000);
   }
   catch(InterruptedException e) 
   {
	   System.out.println(e);
   }*/
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadexampe b1 =new Threadexampe();
		Thread t1 = new Thread(b1);
		Threadexampe b2 = new Threadexampe();
		Thread t2 = new Thread(b2);
		  t1.setName("palak");
           t1.start();
           System.out.println("---");
           t2.setPriority(10);
           t2.setName("gaurik");
           t2.start();
	}

}
