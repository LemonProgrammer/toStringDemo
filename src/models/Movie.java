package models;



public class Movie
{
	private String title;
	private String rating;
	private int year;
	
	public Movie(String title, String rating, int year)
	{
		this.title = title;
		this.rating = rating;
		this.year = year;
	}
	
	// The job of the Constructor is to build an object of the class in its starting state
	// Declaring a constructor
	
	public String getTitle()
	{
		return title;
	}
	public String getRating()
	{
		return rating;
	}
	public int getYear()
	{
		return year;
	}
	
	@Override
	public String toString()
	{
		String movieString = getTitle() + " (" + getYear() + " - " + getRating() + " )";
		return movieString;
	}

}
