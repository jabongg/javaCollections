public class Book implements Comparable<Book> {
	int ISBN;
	String bookName;
	String authorName;
	String publisherName;
	int noOfCopies;
	public Book(int ISBN,
				String bookName,
				String authorName,
				String publisherName,
				int noOfCopies) {					
					this.ISBN 			=  ISBN;
					this.bookName		= bookName;
					this.authorName		= authorName;
					this.publisherName 	= publisherName;
					this.noOfCopies		= noOfCopies;		
	}
	
	@Override
	public int compareTo(Book b) {
		if (ISBN > b.ISBN) {
			return 1;
		} else if (ISBN < b.ISBN) {
			return -1;
		} else {
			return 0;
		}
	}
}