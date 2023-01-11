
import java.util.*;  
import java.io.*;  


public class Employee{
	String name;
	int id;
	int age;
	
	public Employee(String name, int id, int age){
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee>myList = new ArrayList<Employee>();
		
		myList.add(new Employee("Yasir" , 10, 22));
		myList.add(new Employee("Deepak" , 12, 22));
		myList.add(new Employee("Shubham" , 5, 24));
				
		Collections.sort(myList , new Newcomparator());
		
		for(Employee e:myList) {
			System.out.println(e.name);
		}
		
	}	
 }

