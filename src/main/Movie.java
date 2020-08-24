package main;

public class Movie {

	public static final int CHILDREN = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;

	private String _title;
	private Price price;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public String getTitle() {
		return _title;
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) {
		case Movie.REGULAR:
			price = new RegularPrice();
			break;
		case Movie.CHILDREN:
			price = new ChildrenPrice();
			break;
		case Movie.NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}
	
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
	
}
