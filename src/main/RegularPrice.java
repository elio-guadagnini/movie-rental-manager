package main;

public class RegularPrice extends Price {

	@Override
	double getCharge(int daysRented) {
		return 2;
	}

}
