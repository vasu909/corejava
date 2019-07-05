package com.numberconverter.validations;


public class Validation {
	
	public boolean val(String number) {
		
		try
	    {
	        Integer.parseInt(number);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
		
	}

}
