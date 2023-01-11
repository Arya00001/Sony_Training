package stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.lang.reflect.*;

public class matching {

	 public static void main(String[] args) {
		 List<Integer> products = Arrays.asList(3, 4, 6, 12, 20,50,70,80);
		 
		// true when all elements match the predicate
		 boolean one= products.stream()
		         .allMatch(product -> product > 10);

		 // true when any element matches the predicate
		 boolean two= products.stream()
		         .anyMatch(product -> product > 10);

		 // true when no elements match the predicate
		 boolean three = products.stream()
		         .noneMatch(product -> product > 10);
		 
		 System.out.println(one+" "+two+" "+three);
	 }

}
