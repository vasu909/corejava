package com.numberconverter.service;

import com.numberconverter.iface.NumberInterface;

/**
 * 
 * @author Srinivasarao 
 * Here we are converting number to word code implementation.
 * 
 */

public class NumberService implements NumberInterface {

	
	// Its about the thousandNames like thousand
	
	private static final String[] thousandNames = { "", " thousand", " million", " billion", " trillion", " quadrillion",
			" quintillion" };

	// Its about the tenNames like ten twenty thirty

	private static final String[] hundredNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	// Its about the numberNames like one two three

	private static final String[] numberNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	String current;
	
	//Here we are converting the number to word format.
	
	public String convert(int number) {

        if (number == 0) { return "zero"; }
        
        String prefix = "";
        
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }
        
        String current = "";
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                current = s + thousandNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        
        return (prefix + current).trim();
    }

	// its method work on LessThanOneThousand
	
	public String convertLessThanOneThousand(int number) {

		try {

			if (number % 100 < 20) {
				current = numberNames[number % 100];
				number /= 100;
			} else {
				current = numberNames[number % 10];
				number /= 10;

				current = hundredNames[number % 10] + current;
				number /= 10;
			}

			if (number == 0)
				return current;

		} catch (NullPointerException ex) {
			ex.getMessage();

		} catch (Exception ex) {
			ex.getStackTrace();
		}
		return numberNames[number] + " hundred" + current;
	}
	
	
}
