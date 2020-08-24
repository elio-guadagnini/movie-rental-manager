package main;

public class Movie {

	public static final int CHILDREN = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;

	private String _title;
	private int _priceCode;
	private Price price;

	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public String getTitle() {
		return _title;
	}

	public void setPriceCode(int priceCode) {
		this._priceCode = priceCode;
	}

	public double getCharge(int daysRented) {
		double result = 0;
		switch (_priceCode) {
		case Movie.REGULAR:
			price = new RegularPrice();
			result += price.getCharge(daysRented);
			break;
		case Movie.CHILDREN:
			price = new ChildrenPrice();
			result += price.getCharge(daysRented);
			break;
		case Movie.NEW_RELEASE:
			price = new NewReleasePrice();
			result += price.getCharge(daysRented);
			break;
		}
		return result;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		if ((_priceCode == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		return 1;
	}
	
}
