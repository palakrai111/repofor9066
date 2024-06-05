package in.sp.backend;

public class deetingword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "i am the palak rai";
		String rem = "the";
		String y = x.replace("a","e ");
		String z = x.replaceAll("[AEIOUaeiou]"," ");
		//System.out.println(z);
		String s1[]= x.split(" ");
		String new_str= "";
		for(String v : s1)
		{
			if(!rem.equals(v))
			{
				new_str = new_str+v + " ";
				
			}
			//System.out.print(" ");
		}
		
		System.out.println(new_str);

	}

}
