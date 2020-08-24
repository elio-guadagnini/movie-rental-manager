package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.Movie;
import main.Rental;

public class RentalTest {

	@Test
	public void getDaysRentedTest() {

		Rental firstRental = new Rental(new Movie("first title of a movie", 0), 6);

		assertThat(firstRental.getDaysRented(), is(6));
	}

	@Test
	public void setMovieTest() {

		Movie firstMovie = new Movie("first title of a movie", 0);
		Rental firstRental = new Rental(firstMovie, 6);

		assertThat(firstRental.getMovie(), is(firstMovie));

	}

}
