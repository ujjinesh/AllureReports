package com.Fakedata;

import java.time.Month;
import java.util.Random;

import com.github.javafaker.Faker;

public class GetterAndSetters {

	// Method to generate a random month name
	public static String generateRandomMonth() {
		Random random = new Random();
		int monthIndex = random.nextInt(12); // There are 12 months in a year
		Month month = Month.of(monthIndex + 1); // Month enum starts from 1, not 0
		String monthName = month.toString();
		String mon = monthName.substring(0, 1) + monthName.substring(1).toLowerCase();
		return mon;
	}

}
