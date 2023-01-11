package Collections;

import java.util.*;  
import java.io.*;  

public class Student implements Comparable<Student>{

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

 

    @Override
    public int compareTo(Student obj) {
        if(this.id > obj.id) return 1;
        else if(this.id == obj.id) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        ArrayList<Student> myList = new ArrayList<Student>();

        Student c1 = new Student(10 , "Abhishek");
        Student c2 = new Student(20 , "Utkarsh");
        Student c3 = new Student(5 , "Harry");
        Student c4 = new Student(1 , "Shubham");

        myList.add(c1);
        myList.add(c2);
        myList.add(c3);
        myList.add(c4);

        Collections.sort(myList);

        for (Student c:myList) {
            System.out.println(c.id);
        }

    }
}  
