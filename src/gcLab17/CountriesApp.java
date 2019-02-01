package gcLab17;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CountriesApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userCont = "y";
		CountriesTextFile.createDirectory("country_folder");
		CountriesTextFile.createBlankFile("countries.txt");
		System.out.println("Welcome to the Countries App!");
		List<Country> currItems = new ArrayList<>();
		do {
			System.out.println("1 - Display country list.");
			System.out.println("2 - Add country to list");
			System.out.println("3 - Exit");
			int userChoice = Validator.getInt(scnr, "Please select an option.", 1, 3);
			if (userChoice == 1) {
				currItems = CountriesTextFile.readFile();
				for (Country item : currItems) {
					System.out.println(item);
				}
				System.out.println();
			}
			if (userChoice == 2) {
				Country userCountry = new Country();
				userCountry.setName(Validator.getString(scnr, "Please enter the name of the country."));
				userCountry.setPopulation(Validator.getInt(scnr, "Please enter the country's population"));
				CountriesTextFile.appendLine(userCountry);
				
			} if(userChoice == 3) {
				userCont = "n";
			}
		} while (userCont.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");

	}

}
