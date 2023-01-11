package stream;
import java.util.*;
import java.util.stream.Collectors;

public class code {


		
		 public static void main(String[] args)
		    {
		  
		        // Creating a list of Integers
		//        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
	        
     	        // Using Stream filter(Predicate predicate)
//		        list.stream()
//		            .filter(num -> num % 5 != 0)
//		            .forEach(System.out::println);
		
			 
			   //Conversion
			 List<String> words = new ArrayList<String>();

		        words.add("Soorma");
		        words.add("Panga");
		        words.add("Toofan");
		       

//
//		        Map<String, Integer> wordLengths = words.stream()
//		                .collect(Collectors.toMap(
//		                        word -> word, //
//		                        word -> word.length())); // mapping word to wordLength
//		        System.out.println(wordLengths);

               //Using Stream Reduce
//		        int sum = list.stream()
//		                .reduce(0, (a, b) -> a + b);
//		        System.out.println(sum);
		        
		        
		        Optional<String> firstLongWord = words.stream()
		                .filter(word -> word.length() < 6)
		                .findFirst();
		        
		        System.out.println(firstLongWord );

		     

	}

}
