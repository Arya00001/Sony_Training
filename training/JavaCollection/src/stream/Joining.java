package stream;


//Java Program to demonstrate the working
//of the Collectors.joining() method

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Class
public class Joining {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating a custom character array
		char[] ch = { 'S', 'h', 'u', 'b', 'h', 'a', 'm'};
					

		// Converting character array into string
		// using joining() method of Collectors class
		String chString
			= Stream.of(ch)
				.map(arr -> new String(arr))
				.collect(Collectors.joining());

		// Printing concatenated string
		System.out.println(chString);
	}
}

