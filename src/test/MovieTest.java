package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.Movie;

public class MovieTest {

	@Test
	public void getPriceCodeTest() {

		Movie firstMovie = new Movie("first title of a movie", 0);

		assertThat(firstMovie.getPriceCode(), is(0));
	}

	@Test
	public void getTitleTest() {

		Movie firstMovie = new Movie("first title of a movie", 0);

		assertThat(firstMovie.getTitle(), equalTo("first title of a movie"));
	}

	@Test
	public void setPriceCodeTest() {

		Movie firstMovie = new Movie("first title of a movie", 0);
		firstMovie.setPriceCode(2);

		assertThat(firstMovie.getPriceCode(), is(2));

	}

	@Test
	public void getChargeTest1() {
	
		Movie firstMovie = new Movie("first title of a movie", 0);
		
		assertThat(firstMovie.getCharge(5), is(2.0));
	}
	
	@Test
	public void getChargeTest2() {
	
		Movie firstMovie = new Movie("first title of a movie", 1);
		
		assertThat(firstMovie.getCharge(5), is(15.0));
	}
	
	@Test
	public void getChargeTest3() {
	
		Movie firstMovie = new Movie("first title of a movie", 2);
		
		assertThat(firstMovie.getCharge(5), is(4.5));
	}
	
	@Test
	public void getFrequentRenterPointsTest1() {
	
		Movie firstMovie = new Movie("first title of a movie", 0);
		
		assertThat(firstMovie.getFrequentRenterPoints(5), is(1));
	}
	
	@Test
	public void getFrequentRenterPointsTest2() {
	
		Movie firstMovie = new Movie("first title of a movie", 1);
		
		assertThat(firstMovie.getFrequentRenterPoints(5), is(2));
	}
	
	@Test
	public void getFrequentRenterPointsTest3() {
	
		Movie firstMovie = new Movie("first title of a movie", 2);
		
		assertThat(firstMovie.getFrequentRenterPoints(5), is(1));
	}
	
}
