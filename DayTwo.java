// Assignments for day 2
public class DayTwo {
	 static final int OUT = 0;
	 static final int IN = 1;
	 
	public static void main(String[] args) {
		// #1 Generate Multiplication Table using For Loop
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j ++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		// #2 Display the Fibonacci Series using a for loop
		int terms = 10;
		int var1 = 0, var2 = 1;
		int nextTerm = var1 + var2;
		for (int i = 1; i <= terms; i++) {
			var1 = var2;
			var2 = nextTerm;
			nextTerm = var1 + var2;
			System.out.print(nextTerm + " ");
		}
		
		// #3 Display lowercase alphabet using for loop HINT -  for(c = 'a'; c <= 'z'; ++c)
		for (char a = 'a'; a < 'z' ; a++) {
			System.out.print(a + " ");
		}
		
		// #4
		// Reverse a Number using a while loop in Java HINT - Find the remainder of no by dividing 10 using % operator.
		int num = 956;
		int reversed = 0;

	    while(num != 0) {
	      int digit = num % 10;		// Divide by 10 to find the remainder
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }
	    System.out.println("Reversed Number: " + reversed);
	    
		
		// #5
		// Calculate the power of a number using a for-loop
		int numToBeCalculated = 12;
		int sum = 1;
		int power = 4; 	// You can change this value if you wish.
		for(int i = 1; i <= power; i++){
			sum = sum * numToBeCalculated;
			System.out.println(sum);
		}
		
		// #6 Program to Calculate Average Using Arrays
		int[] myArray = {2,4,6,8,10,12};
		int average = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			average = average + myArray[i];
		}
		average = (average / myArray.length);
		System.out.println(average);
		
		// #7 Add Two Matrix Using MultiDimensional Arrays
		int rows = 2; 
		int columns = 3;
		// Values to the matrices
        int[][] firstMatrix = { {1, 2, 3}, 
        						{5, 2, 3} };
        int[][] secondMatrix = { {3, 2, 1}, 
        						 {3, 2, 5} };

       // The ultra matrix that will contain values from first and second matrix
        int[][] sum1 = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum1[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum1) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
		}
		
		// #8 Program to count vowels, consonants, digits, and spaces
		
		
		// #9 Program to print half of a pyramid
		char star = '*';
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(star + " ");
			System.out.println();
		}
		
		// #10 Count number of words
//		 String myString = "One two three\n four\tfive  ";
//	     System.out.println("Number of words : " + countWords(myString));
		
		// #11 Find the occurance of a specific character in sentence
		// split the string by spaces in a
		String str = "My name is Isabel and my grandmas name is Isabel";
	    String word = "Isabel";
	    System.out.println(countOccurences(str, word));
	  }

	 static int countWords(String str)
	    {
	        int state = OUT;
	        int wc = 0;  // word count
	        int i = 0;
	         
	        // Scan all characters one by one
	        while (i < str.length())
	        {
	            // If next character is a separator, set the
	            // state as OUT
	            if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
	                    || str.charAt(i) == '\t')
	                state = OUT;
	                 
	      
	            // If next character is not a word separator
	            // and state is OUT, then set the state as IN
	            // and increment word count
	            else if (state == OUT)
	            {
	                state = IN;
	                ++wc;
	            }
	      
	            // Move to next character
	            ++i;
	        }
	        return wc;
	    }
	 static int countOccurences(String str, String word){
			String a[] = str.split(" ");
		 
		    // search for pattern in a
		    int count = 0;
		    for (int i = 0; i < a.length; i++)
		    {
		    // if match found increase count
		    if (word.equals(a[i]))
		        count++;
		    }
		 
		    return count;
		}


}
