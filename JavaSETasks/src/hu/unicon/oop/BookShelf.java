package hu.unicon.oop;

import java.util.Arrays;

public class BookShelf 
{
	public BookShelf()
	{
		this.shelfNr = 5;
		this.booksPerShelf = 10;
		books = new int[shelfNr];
	}
	
	public BookShelf(int shelfNr)
	{
		this.shelfNr = shelfNr;
		this.booksPerShelf = 10;
		books = new int[shelfNr];
	}
	
	public BookShelf(int shelfNr, int[] books)
	{
		this.shelfNr = shelfNr;
		this.books = books;
	}

	public BookShelf(int shelfNr, int booksPerShelf, int[] books) 
	{
		// super(); not needed in this case
		this.shelfNr = shelfNr;
		this.booksPerShelf = booksPerShelf;
		this.books = books;
		
		for (int i = 0; i < books.length; i++) 
		{
			if(books[i] > booksPerShelf) books[i] = booksPerShelf;
		}
		
	}
	
	public void addBooks(int shelf, int incr)
	{
		if (shelf < this.books.length && shelf >-1)
		{
			this.books[shelf] = (this.books[shelf] + incr > booksPerShelf) ? 
					booksPerShelf : 
					this.books[shelf] + incr;
		}
	}
	
	public void addBooks(int books)
	{
		for (int i = 0; i < this.books.length; ++i)
		{
			addBooks(i, books);
		}
	}
	
	public int getBookCount()
	{
		int sum = 0;
		for (int i = 0; i < books.length; i++) {
			sum+=books[i];
		}
		return sum;
	}
	
	public void str(String s)
	{
		this.s = s;
	}
	
	
	
	@Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < books.length; i++)
		{
			for (int j = 0; j < books.length; j++)
			{
				if(j < books[i])
				{
					sb.append("X");
				}
				else
				{
					sb.append("_");
				}
			}
			sb.append("\n");
		}
		
		sb.append("\n");
		
		return sb.toString();
		/*return "BookShelf [shelfNr=" + shelfNr + ", booksPerShelf=" + booksPerShelf + ", books="
				+ Arrays.toString(books) + "]";*/
	}


	private int shelfNr;
	private int booksPerShelf;
	private int[] books; 
	private String s;
	
}
