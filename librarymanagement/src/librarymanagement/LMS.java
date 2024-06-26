package librarymanagement;
import java.util.*;
public class LMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Library ob = new Library();
        Scanner sc = new Scanner(System.in);
       Book b1 = new Book(1,"abc");
        Book b2 = new Book(2,"abcd");
        ob.addBook(b1);
        ob.addBook(b2);
     /*   for(int i = 0; i <2; i++)
		{
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			Book b = new Book(id,name);
			ob.addBook(b);
			
		}*/

        
        
        System.out.println("books in library");
        for(Book b : ob.getBooks())  // to print all books infor //to getbooks method returning arraylits
        {
        	System.out.println(b.getBooks());
        }
       ob.removeBook(b1);  // to remove list
        System.out.println("updated list"); // to see update list
        for(Book b : ob.getBooks())  // to print all books infor //to getbooks method returning arraylits
        {
        	System.out.println(b.getBooks());
        }
        
	}

}
