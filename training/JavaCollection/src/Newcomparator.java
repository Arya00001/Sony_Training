

	import java.util.Comparator;
	import java.util.*;  
	import java.io.*;  
	

	public class Newcomparator implements Comparator<Employee>{
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
	}

