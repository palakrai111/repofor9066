package librarymanagement;

public class Book 
{
	
			int bid;
			String bname;
		    public Book(int bid, String bname) {
				super();
				this.bid = bid;
				this.bname = bname;
			}
			
		    public int getBid() {
				return bid;
			}
			public void setBid(int bid) {
				this.bid = bid;
			}
			public String getBname() {
				return bname;
			}
			public void setBname(String bname) {
		    this.bname = bname;
	         }
			public String getBooks()
			{
				return bid + " "+ bname;
			}
	
}
