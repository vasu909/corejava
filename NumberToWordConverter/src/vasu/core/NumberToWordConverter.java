package vasu.core;

public class NumberToWordConverter {

	public void powerToWord(int n, String ch) {
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };

		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty",
				" Ninety" };

		if (n > 19) {
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}
		if (n > 0)
			System.out.print(ch);
	}

	public static void main(String[] args) {

		int n = 999_999_999;
		System.out.print(n);
		if (n <= 0) {
			System.out.println("Enter numbers greater than 0");
		} else {
			NumberToWordConverter a = new NumberToWordConverter();
			a.powerToWord((n / 1000000000), " Hundred");
			a.powerToWord((n / 10000000) % 100, " crore");
			a.powerToWord(((n / 100000) % 100), " lakh");
			a.powerToWord(((n / 1000) % 100), " thousand");
			a.powerToWord(((n / 100) % 10), " hundred");
			a.powerToWord((n % 100), " ");
		}
	}
}