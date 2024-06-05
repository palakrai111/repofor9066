package in.sp.backend;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1 = "keep";
          String s2 = "peek";
          char ch1[]= s1.toCharArray();
          char ch2[] = s2.toCharArray();
          Arrays.sort(ch1);
          Arrays.sort(ch2);
          boolean b = Arrays.equals(ch1, ch2);
          System.out.println(b);
	}

}
