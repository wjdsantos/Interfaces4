package entities;

import java.security.InvalidParameterException;

public interface InterestService {

	double getinterestRate();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getinterestRate() / 100.0, months);
	}
}
