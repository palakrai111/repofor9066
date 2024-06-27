package fileioexample;
import java.io.*;
public class fileinputexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
     FileInputStream fis = new  FileInputStream("D:\\testing.txt");
  /* int i =  fis.read();
   System.out.println((char)i);*/
     int i;
     while((i=fis.read())!= -1)
     {
    	 System.out.print((char)i);
     }
   fis.close();
		}catch(Exception e) 
		{System.out.println(e);}
	}

}
