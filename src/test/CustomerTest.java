package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.Customer;
import main.Movie;
import main.Rental;

public class CustomerTest {

	@Test
	public void getNameTest() {
		
		Customer firstCustomer = new Customer("elio");
		
		assertThat(firstCustomer.getName(), equalTo("elio"));
		
	}

	@Test
	public void addRentalTest() {

		Customer firstCustomer = new Customer("elio");
		firstCustomer.addRental(new Rental(new Movie("first title of a movie", 0), 6));
		
		assertThat(firstCustomer.size(), is(1));
	}

	@Test
	public void statementTest() {

		Customer firstCustomer = new Customer("elio");
		firstCustomer.addRental(new Rental(new Movie("first title of a movie", 0), 6));

		assertThat(firstCustomer.htmlStatement(), equalTo("Rental Record for elio\n"
				+ "\tfirst title of a movie\t2.0\n"
				+ "Amount owed is 2.0\nYou earned 1\n"));
	}

	@Test
	public void secondStatementTest() {

		Customer firstCustomer = new Customer("elio");
		firstCustomer.addRental(new Rental(new Movie("first title of a movie", 0), 6));
		firstCustomer.addRental(new Rental(new Movie("second title of a movie", 1), 6));

		assertThat(firstCustomer.htmlStatement(), equalTo("Rental Record for elio\n"
				+ "\tfirst title of a movie\t2.0\n"
				+ "\tsecond title of a movie\t18.0\n"
				+ "Amount owed is 20.0\nYou earned 3\n"));
	}

	@Test
	public void thirdStatementTest() {

		Customer firstCustomer = new Customer("elio");
		firstCustomer.addRental(new Rental(new Movie("first title of a movie", 0), 6));
		firstCustomer.addRental(new Rental(new Movie("second title of a movie", 1), 6));
		firstCustomer.addRental(new Rental(new Movie("third title of a movie", 2), 6));

		assertThat(firstCustomer.htmlStatement(), equalTo("Rental Record for elio\n"
				+ "\tfirst title of a movie\t2.0\n"
				+ "\tsecond title of a movie\t18.0\n"
				+ "\tthird title of a movie\t6.0\n"
				+ "Amount owed is 26.0\nYou earned 4\n"));
	}
	
	@Test
	public void getTotalChargeTest() {

		Customer firstCustomer = new Customer("elio");
		firstCustomer.addRental(new Rental(new Movie("first title of a movie", 0), 6));
		firstCustomer.addRental(new Rental(new Movie("second title of a movie", 1), 6));
		firstCustomer.addRental(new Rental(new Movie("third title of a movie", 2), 6));

		assertThat(firstCustomer.getTotalCharge(), is(26.0));
	}
	
	@Test
	public void getFrequentRenterPoints() {
		
		Customer firstCustomer = new Customer("elio");
		firstCustomer.addRental(new Rental(new Movie("first title of a movie", 0), 6));
		firstCustomer.addRental(new Rental(new Movie("second title of a movie", 1), 6));
		firstCustomer.addRental(new Rental(new Movie("third title of a movie", 2), 6));

		assertThat(firstCustomer.getTotalFrequentRenterPoints(), is(4));
	}
	
}
