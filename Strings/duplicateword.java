package in.sp.backend;

public class duplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "big buck big buck big";
		String str1[]= str.split(" ");
		int count ;
		 System.out.println("Duplicate words in a given string : ");     
	        for(int i = 0; i <str1.length; i++) 
	        {    
	            count = 1;    
	            for(int j = i+1; j < str1.length; j++)
	            {    
	                if(str1[i].equals(str1[j])) 
	                {    
	                    count++;    
	                    //Set words[j] to 0 to avoid printing visited word    
	                    str1[j] = "0";    
	                }    
	            }  
	            
	            if(count > 1 && str1[i] != "0")    
	                System.out.println(str1[i]);    
	            
	        }
		
		

	}

}
