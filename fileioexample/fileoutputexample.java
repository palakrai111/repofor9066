package fileioexample;

import java.io.*;

public class fileoutputexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		 FileOutputStream fos = new  FileOutputStream("D:\\testing.txt");
		 String b = "i am palak";
		 byte x[]= b.getBytes();
		 fos.write(x);
		 System.out.println("success");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
