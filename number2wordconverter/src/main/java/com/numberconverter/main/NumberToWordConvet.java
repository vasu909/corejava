package com.numberconverter.main;

import java.io.InputStreamReader;
import java.util.Scanner;

import com.numberconverter.exception.NumberformatException;
import com.numberconverter.service.NumberService;
import com.numberconverter.validations.Validation;

/**
 * 
 * @author Srinivasarao This class is used to convert number to word format.
 *
 */
public class NumberToWordConvet

{

	String word;

	public String convertLessThanOneThousand(String number) throws NumberformatException {

		try {

			// here we are calling validation method
			Validation validation = new Validation();
			Boolean status = validation.val(number);
			if (status) {
				// Creating object for service class and calling convert method.
				NumberService ns = new NumberService();
				word = ns.convert(Integer.parseInt(number));
			}else {
				throw new NumberformatException("Number Format is wrong and please check the below number :: " + number);
			}

		} catch (NumberformatException ex) {
			System.err.print(ex);
		} catch (Exception ex) {
			ex.getStackTrace();
		}
		return word;

	}

	// Main Method calling here.

	public static void main(String[] args) throws Exception {
		NumberToWordConvet obj = new NumberToWordConvet();

		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.println("Reading input from console using Scanner in Java ");
		System.out.println("Please enter your input: ");
		String input = scanner.nextLine();

		System.out.println("Number to word format::::" + obj.convertLessThanOneThousand(input));
	}
}
