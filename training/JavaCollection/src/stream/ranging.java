package stream;
import java.util.*;
import java.util.stream.IntStream;
	  
	class ranging {
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	        // Creating an IntStream
	        IntStream stream = IntStream.range(6, 10);
	  
	        stream.forEach(System.out::println);
	    }
	}


