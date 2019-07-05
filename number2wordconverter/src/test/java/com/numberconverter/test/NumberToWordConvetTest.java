package com.numberconverter.test;

import com.numberconverter.main.NumberToWordConvet;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class NumberToWordConvetTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NumberToWordConvetTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NumberToWordConvetTest.class );
    }

  
    public void testApp()
    {
        assertTrue( true );
    }
    
    @org.junit.Test
	public void numberTest() throws Exception {
		NumberToWordConvet con=new NumberToWordConvet();
		String num=con.convertLessThanOneThousand("100");
		assertEquals("one hundred", num);
	}
    
    @org.junit.Test
	public void numberTest2() throws Exception {
		NumberToWordConvet con=new NumberToWordConvet();
		String num=con.convertLessThanOneThousand("200");
		assertEquals("two hundred", num);
	}
    
    @org.junit.Test
   	public void numberTest3() throws Exception {
   		NumberToWordConvet con=new NumberToWordConvet();
   		String num=con.convertLessThanOneThousand("999");
   		assertEquals("nine hundred ninety nine", num);
   	}
    
    @org.junit.Test
   	public void numberTest4() throws Exception {
   		NumberToWordConvet con=new NumberToWordConvet();
   		String num=con.convertLessThanOneThousand("4587");
   		assertEquals("four thousand five hundred eighty seven", num);
   	}
    
    @org.junit.Test
   	public void numberTest5() throws Exception {
   		NumberToWordConvet con=new NumberToWordConvet();
   		String num=con.convertLessThanOneThousand("3256456");
   		assertEquals("three million two hundred fifty six thousand four hundred fifty six", num);
   	}
    @org.junit.Test
   	public void numberTest6() throws Exception {
   		NumberToWordConvet con=new NumberToWordConvet();
   		String num=con.convertLessThanOneThousand("3254");
   		assertEquals("one2", num);
   	}
    @org.junit.Test
   	public void numberTest7() throws Exception {
   		NumberToWordConvet con=new NumberToWordConvet();
   		String num=con.convertLessThanOneThousand("1254");
   		assertNotSame("one2", num);
   	}
    
    
    
}
