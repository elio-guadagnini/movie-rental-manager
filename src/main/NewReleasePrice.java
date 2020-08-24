package main;

public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	@Override 
	public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1) 
			return 2;
		return 1;
	}

	@Override
	double getCharge(int daysRented) {
		return daysRented * 3;
	}
}
