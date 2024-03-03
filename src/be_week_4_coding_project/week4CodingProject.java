package be_week_4_coding_project;

import java.util.Arrays;

public class week4CodingProject {

	public static void main(String[] args) {
		
		/*
		 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
			b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
				i. Make sure that there are 9 elements of type int in this new array.  
				ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
				iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
			c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};  	//creates new integer array called 'ages' with those numbers
		int result = ages[ages.length - 1] - ages[0]; 	/* takes the last element of the array and subtracts the first element of the array.
														age.length finds the length of the array and 1 is subtracted because the last element 
														of an array has index that is one smaller than the length of the array since the first
														element of an array has an index of 0 and not 1. */
														
		System.out.println(result);						
		
		int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 21};
		int result2 = ages2[ages2.length - 1] - ages2[0];	//uses the same programmatic way of subtracting the first element from the last
	
		System.out.println(result2);
		
		
		int sum = 0;									// creates the sum variable at value of 0
		for (int i = 0; i < ages.length; i++) {			//this loop will iterate through each index of the ages array
			sum += ages[i];								//with each iteration, that indexes value will be added to the sum value
		}
		int average = sum/ages.length;					//average is calculated by the sum of the elements divided by the number of elements
		
		System.out.println(average);
		
		
		/*
		 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 */
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int totalLetterSum = 0;
		
		for (String name : names) {						// enhanced for loop that iterates across the array called names
			totalLetterSum += name.length();
		}
		
		int averageLetters = totalLetterSum/names.length;
		
		System.out.println(averageLetters);
		
		
		
		StringBuilder concattedArray = new StringBuilder();	//repetitively manipulating strings, it's better to use StringBuilder to save on program memory
		int count = 1;										//this is the control variable for what will have commas after it, starting with 1
		for (String name : names) {							//iterates through each element of the array of names
			concattedArray.append(name);					//adds that iteration of name to the StringBuilder
			if (count<names.length) {						//control for what gets commas, set up so the last element doesn't get a comma
				concattedArray.append(", ");
			}
			count++;										//this is helps control what gets commas by adding 1 to this value for each iteration
		}
		
		System.out.println(concattedArray);
		
		
		
		//3. How do you access the last element of any array?
		
				//Let's say the name of the array is myArray so then it can be accessed by using myArray[myArray.length-1]
				// ex:
				System.out.println(names[names.length -1]);
		//4. How do you access the first element of any array?

				//Let's say the name of the array is myArray so then it can be accessed by using myArray[0]
				// ex:
				System.out.println(names[0]);
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
				
		int [] nameLengths = new int[6];					//setting up integer array of length 6 since that is the length of the names array
		for (int i = 0; i < 6; i++) {						//using a for loop with indexes instead of enhanced for loop so that the same index can be referenced in both arrays
			nameLengths[i] = names[i].length();
		}
		
		System.out.println(Arrays.toString(nameLengths));	//checking if the array constructed properly. This method has to be used to print an array.
		
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		
		int sumOfNameLengths = 0;
		for (int i : nameLengths) {
			sumOfNameLengths += i;
		}
		
		System.out.println(sumOfNameLengths);
		
		
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		//		(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println(repeatWord("Hello",3));
				
		
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
		//		(the full name should be the first and the last name as a String separated by a space).
		
		String firstName = "Bill";
		String lastName = "Murray";
		System.out.println(fullName(firstName, lastName));
		
		
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println(isGreaterThan100(ages));
		
		int[] sum99 = {45,54};
		System.out.println(isGreaterThan100(sum99));
		
		int[] sum100 = {50, 50};
		System.out.println(isGreaterThan100(sum100));
		
		int[] sum101 = {55,46};
		System.out.println(isGreaterThan100(sum101));
		
		
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double [] doubleArray = {23, 25, 11, 13, 13, 34, 23, 54, 12, 6};
		System.out.println(avgDblArray(doubleArray));
		
		double [] doubleArray2 = {23, 25, 11, 13, 13};
		System.out.println(avgDblArray(doubleArray2));
		
		double [] doubleArray3 = {27.4, 29.4, 15.4, 17.4, 17.4};
		System.out.println(avgDblArray(doubleArray3));
			
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		System.out.println(isFirstAvgGreater(doubleArray, doubleArray2));	//first>second - should return true
		System.out.println(isFirstAvgGreater(doubleArray2, doubleArray3));	//first<second - should return false
		System.out.println(isFirstAvgGreater(doubleArray, doubleArray3));	//first=second - should return false
		
		
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println(willBuyDrink(true,10.50)); 	//should be false
		System.out.println(willBuyDrink(true,10.51)); 	//should be true
		System.out.println(willBuyDrink(false,10.51));	//should be false
		System.out.println(willBuyDrink(false,10.49));	//should be false
		
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		System.out.println(isPalindrome("mom"));
		System.out.println(isPalindrome("bro"));
		System.out.println(isPalindrome("Dad"));
		System.out.println(isPalindrome("Madam, I'm Adam"));
		
		
	}
	
	
	// Method 13
	public static boolean isPalindrome (String complexString) {	
		//method will return boolean, parameter takes in a string
		String simplifiedString = ((complexString.replaceAll("\\p{Punct}", "").replaceAll("\\s",""))).toLowerCase();
		//this makes a new string that converts the original by removing punctuation, removing spaces, and making it all lowercase so that only letters, no matter the case, are compared
		int truthValue = 0;
		for (int i = 0; i < simplifiedString.length(); i++) {
			if (simplifiedString.charAt(i) == simplifiedString.charAt(simplifiedString.length()-1-i)) {
				truthValue ++;
			}
			//this iterates across the new string and checks if the first character matches the last, the second character matches the second to last, etc
			//every time it has a successful check, 1 is added to the truth value
		}
		return truthValue == simplifiedString.length();
		//it returns true if the truth value is equal to the length of the new string because it it iterate across each letter, then that would match the length if it is a palindrome
	}
	
	
	
	// Method 12
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;  //variable isHotOutside is already a boolean value, and the comparison returns true under those conditions then we use the AND (&&) operator to check if both are true
	}
	
	
	
	// Method 11
	public static boolean isFirstAvgGreater(double [] dblArray1, double [] dblArray2) {
		return avgDblArray(dblArray1) > avgDblArray (dblArray2);		//calling on previous method 10
	}
	
	
	
	// Method 10
	public static double avgDblArray (double [] dblArray) {				//method returns double type
		double sum = 0;
		for (double d : dblArray) {										//iterates through the array
			sum += d;													//adds each iteration to the total sum
		}
		double avg = sum/dblArray.length;								//average is found by the sum of elements divided by number of elements
		return avg;
	}
		
	
	
	
	// Method 9
	public static boolean isGreaterThan100(int[] intArray) {				//method returns boolean type
		int sum = 0;
		for (int i : intArray) {
			sum += i;
		}
		return sum > 100;												//returns true if the sum value is greater than 100, and false if it's not
	}
	
	
	
	// Method 8
	public static String fullName(String firstName, String lastName) {	//method returns String type
		String fullName = firstName + " " + lastName;					//this is the process for concatenating Strings
		return fullName;
	}
	
	
	
	// Method 7
	public static String repeatWord (String word, int n) {				//Methods are set up outside of main method so they can be used within main method
		StringBuilder repeatedWord = new StringBuilder();				//I used StringBuilder since I was manipulating what would be a string over and over
		for (int i = 0; i < n; i++) {
			repeatedWord.append(word);									//this is the method to concatenate StringBuilders
		}
		return repeatedWord.toString();									//this changes the StringBuilder to a String to match the correct return type
	}
	
	
	
	
}












