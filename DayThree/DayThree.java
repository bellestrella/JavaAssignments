// In an array list, elements can be added and removed.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayThree {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		//This syntax creates an array list object
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Isabel");
		stringList.add("Bella");
		stringList.add("Honey");
		
		System.out.println("#1 Printing the arrayList before and after swap:");
		System.out.println(stringList);
		// #1 Swap two items in an array list that are string
		Collections.swap(stringList, 0, 1);
		System.out.println(stringList);
		
		// #2 Write a program to clone an array list to another array list using clone() of arraylist.
		ArrayList<String> otherStrings = new ArrayList<String>();
		otherStrings.add("");
		otherStrings.add("");
		otherStrings.add("");
		Collections.copy(otherStrings, stringList);
		System.out.println("\n#2 Printing the cloned array: ");
		System.out.println(otherStrings);
		
		// #3 Iterate a linked list in reverse order
		LinkedList<Integer> int_list = new LinkedList<Integer>();
		int_list.add(2);
		int_list.add(4);
		int_list.add(6);
		
		// The descendingIterator method returns an iterator over the elements
		// in this LinkedList "int_list" in reverse sequential order.
		Iterator x = int_list.descendingIterator();
		System.out.println("\n#3 Printing the linked list in reverse order: ");
		while(x.hasNext()) {
			System.out.print(x.next() + " ");
		}
		
		// #4 Insert the specified element at the end of a linked list using offerLast().
		int_list.offerLast(8);
		System.out.println("\n\n#4 New int_list after using the offerLast():");
		System.out.println(int_list);
		
		// #5 Search an element in an arrayList
		int index1 = stringList.indexOf("Bella");
		int index2 = stringList.indexOf("Watermelon");
		System.out.println("\n#5 Searching for existing elements in an ArrayList:");
		if (index1 == -1) {
			System.out.println("The element Bella is not in the ArrayList");
		}
		else {
			System.out.println("The element Bella is in the ArrayList");
		}
		
		if (index2 == -1) {
			System.out.println("The element Watermelon is not in the ArrayList");
		}
		else {
			System.out.println("The element Watermelon is in the ArrayList");
		}
		
		// #6 Write a program to join two array lists
		System.out.println("\n#6 Joining two ArrayLists:");
		ArrayList<String> newList = new ArrayList<String>();
		newList.add("Cherry");
		newList.add("Pumpkin");
		newList.add("Cinnamon");
		// Joining with a existing Array List created above
		stringList.addAll(newList);
		System.out.println(stringList);
		
		// COMPARABLE
		// #7 Compare the ranking of Player where Player class has ranking, name and age as attributes using comparable interface.
		ArrayList<Day3Player> playerList = new ArrayList<Day3Player>();  
		playerList.add(new Day3Player("Isabel",1,29));  
		playerList.add(new Day3Player("Sylvia",2,33));
		System.out.println("\n#7 Comparing the rank of two players using COMPARABLE:");
		Collections.sort(playerList);  // We are sorting based on the ranking
		for(Day3Player st:playerList){  
		System.out.println(st.getName()+" "+st.getRanking()+" "+st.getAge());  
		}
		
		// COMPARATOR
		// #8 Compare the Player based on age and ranking using Comparator interface.	
		Collections.sort(playerList, new Day3AgeCompare());
		System.out.println("\n#8a Comparing the AGE of two players using COMPARATOR:");
		for(Day3Player player: playerList) {
			System.out.println(player.name +" "+ player.age);
		}
		
		Collections.sort(playerList, new Day3RankCompare());
		System.out.println("\n#8b Comparing the RANK of two players using COMPARATOR:");
		for(Day3Player player: playerList) {
			System.out.println(player.name +" "+ player.ranking);
		}
		
		// 9.Open a text file, read the file one line at a time. Read each line as a String and print the total number of characters.
		System.out.println("\n#9 Reading from a file");
		
		// Try catch in case that the file is not found.
		try {
		      File myObj = new File("src/textFile");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		File myObj = new File("src/textFile");
		FileInputStream fileStream = new FileInputStream(myObj);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
		int characterCount = 0;
		String line;
		
		while((line = reader.readLine()) != null){
                characterCount += line.length();
        	}
		System.out.println("Total number of characters = " + characterCount);
		
		// #10 Write a lambda expression to generate the square of a number.
		System.out.println("\n#10 Lambda expression to generate the square of a number: ");
		Day3Lambda squared = (int a) -> {
			System.out.println("Squared numbers: " + a*a);
		};
		squared.printSqaured(5);
		
	}
		
}

