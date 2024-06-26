package librarymanagement;

import java.util.ArrayList;

public class Library 
{
	ArrayList<Book> al;
	Library()
			{
				al = new ArrayList<Book>();
			}
		     void addBook(Book b1)
		     {
		    	 al.add(b1);
		     }
			void removeBook(Book b1)
			{
				al.remove(b1);
			}
			ArrayList<Book> getBooks()
			{
				return al;
			}
     
			
}
