
public class DayOne {
	public static void main (String[] args) {
		
		// #1
		// Accept an isbn, name, author, price, and print the values.
		printBookStuff(25, "Mary Had a Little Lamb", 250);
		
		// #2
		// Compute the quotient and remainder for a provided number
		
		// #3
		// Swap two numbers using a temporary variable;
		int x = 10;
		int y = 20;
		int temp = x;
		x = y;
		y = temp;
		System.out.println(y);
		
		// #4
		// Swap two numbers without using a temporary variable;
		int a = 10;
		int b = 20;
		a = a + b; // a is 10 + 20
		b = a - b; // b is 30 - 20
		a = a - b; // a is 30 - 10
		
		// #5 
		// Check whether an alphabet is vowel or consonant using if..else statement
		char ch = 'b';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Cha che chi cho chu");
		}
		else
			System.out.println("It's a continent.");
		
		// #6
		// The same as #5, using a switch statement. 
		// *Complete on ClassLabs project
		
		// #7
		// Java Program to Check a Leap Year
		int year = 1992;
		boolean leap = false;
		
		// If the year is divisible by 4
		if (year % 4 == 0) {
			if (year % 100 == 0) {		// If the year is a century
				if (year % 400 == 0) { 	// If the year is divisible by 400, it is a leap year
					leap = true;
				}
				else
					leap = false;
			}
			else
				leap = true;
		
		}
		else
			leap = false;
		
		if (leap)
			System.out.println(year + " is a leap year.");
		else
 			System.out.println(year + " is NOT  leap year.");
		
		// #8 
		// Check if a Number is Positive or Negative using if..else
		int num = 2;
		if (num > 0) {
			System.out.println("It is positive.");
		}
		else
			System.out.println("It is not positive.");
		
		// #9
		// Print prime numbers between two integers
		
	}
	
	public static void printBookStuff(int isbn, String title, int price) {
		System.out.println("The isbn is: " + isbn);
		System.out.println("The title of the book is: " + title);
		System.out.println("The price of the book is: " + price);
	}
	
}
