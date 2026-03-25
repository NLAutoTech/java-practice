package java_fund_practice;

import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		
		
//Basics & Input/Output
System.out.println("Q. Print “Hello World");	
		System.out.println("Hello, World");
System.out.println("Q. Take input from user and print it");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("You entered: " + age);
		
System.out.println("Add, subtract, multiply, divide two numbers");
		int num1 =25;
		int num2 = 20;
		System.out.println("When we multiple 2 numbers  "+num1*num2);
		System.out.println("When we add 2 numbers  "+(num1+num2));
		System.out.println("When we subtract 2 numbers  "+(num1-num2));
		System.out.println("When we divide 2 numbers"+(num1/num2));
		
		
		//Swap two numbers (using third variable)
		int num3 = num1;
		num1=num2;
		num2=num3;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	
		//Swap two numbers (without third variable)
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	
		
	

	}

}
