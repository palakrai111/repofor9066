package fileioexample;
import java.io.*;
public class Bufferreaderexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader fr = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("enetr integet");
		int i = Integer.parseInt(fr.readLine());
		System.out.println(i);
		System.out.println("enetr string");
		String name = fr.readLine();
		System.out.println(name);
		System.out.println("enetr float");
		float f = Float.parseFloat(fr.readLine());
		System.out.println(f);
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
