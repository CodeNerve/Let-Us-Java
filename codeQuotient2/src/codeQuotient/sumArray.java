package codeQuotient;

import java.util.Scanner;

public class sumArray
 { 
    String name; 
    int age; 
    String college; 
    String course; 
    String address; 
    sumArray 
    (String name, int age, String college, String course, String address) 
    { 
        this.name = name; 
        this.age = age; 
        this.college = college; 
        this.course = course; 
        this.address = address; 
    } 
public String toString() 
    { 
        return name + " " + age + " " + college + " " + course + " " + address; 
    } 
public static void main(String[] args) 
    { 
	sumArray b =  
        new sumArray("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu"); 
        System.out.println(b); 
        System.out.println(b.toString()); 
    } 
} 