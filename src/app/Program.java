package app;

import models.Movie;

public class Program
{
	Movie m1;

	public void run()
	{
		Movie [] movies = {
			new Movie("Up", "PG",  2009),
			new Movie("Deadpool", "R", 2016)
		};
		for(Movie movie : movies)
		{
			System.out.println(movie);
		}
//		m1 = new Movie("The Prestige", "PG13", 2006);
//		System.out.println(m1);
//		System.out.println(m1.toString());

		
		
		
	}
}
