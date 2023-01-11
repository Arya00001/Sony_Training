package Collections;

import java.util.Comparator;
import java.util.*;  
import java.io.*;  


public class newComparator implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.age > o2.age) return 1;
		else if (o1.age == o2.age) return 0;
		return -1;
	}
}

