
public class movienetflix {
	public static void main(String[] args) {
		Movie movie1 = new Movie("TheDarkKnight", 9);
		Movie movie2 = new Movie("TheDarkKnightRises", 8.5);
		Movie movie3 = new Movie("Batman", 7.6);
		Movie movie4 = new Movie("BackToTheFuturePart2", 7.8);
		Movie movie5 = new Movie("JurrasicPark",8.1);
		
		movie1.getTicketPrice();
		NetflixQueue movies = new NetflixQueue();
		movies.addMovie(movie1);
		movies.addMovie(movie2);
		movies.addMovie(movie3);
		movies.addMovie(movie4);
		movies.addMovie(movie5);
		movies.printMovies();
		System.out.println("The best movie is "+movies.getBestMovie());
		System.out.println("The second best movie is " + movies.getSecondBestMovie());
				
	}
}
