package java_fund_practice;

import java.util.Scanner;

public class ifelsee {
//decision making statements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Check whether a number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Entered Number is even");
		}else {
			System.out.println("Entered Number is odd");
		}
//		Check whether a number is positive, negative, or zero
		if(num>0) {
			System.out.println("Number is Positive");
		}else if(num==0) {
			System.out.println("Number is Zero");
		}else {
			System.out.println("Number is Negative");
		}
//		Find the largest of two numbers
		int a = 20;
		int b= 30;
		int c = 43;
		if(a>b) {
			System.out.println(a +" is greater than "+ b);
		}else {
			System.out.println(b+" is greater than "+ a);
		}
//		Find the largest of three numbers
		if(a>b & a>c) {
			System.out.println(a+" is largest of three numbers");
		}else if(b>c) {
			System.out.println(b+ " is largest of three numbers");
		}else {
			System.out.println(c+ " is largest of three numbers");
		}
//		Check whether a number is divisible by 5
		if (a % 5 == 0) {
			System.out.println(a + " is divisible by 5");
		}else {
			System.out.println(a +" is not divisible by 5");
		}
		
		//Take age as input and print whether the user is eligible to vote
		
		System.out.println("Enter age of voter");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Voter is eligible to vote");
		}else {
			System.out.println("voter is not eligible");
		}
		//Check whether a number is divisible by both 3 and 5
		if(num%3==0 && num%5==0) {
			System.out.println("number is divisible by 3 and 5");
		}else {
			System.out.println("number is not divisible by 3 and 5");
		}
		//Find the smallest of three numbers
		if(a<b && a<c) {
			System.out.println(a + " is the smallest number");
		}else if(b<c){
			System.out.println(b + " is the smallest");
		}else {
			System.out.println(c +" is the smallest number");
		}
		//Check whether a number is multiple of 10
		if (num%10 ==0) {
			System.out.println(num +" is divisible by 10");
		}else { 
			System.out.println(num+ " is not divisible by 10");
		}
		//Check pass or fail based on marks
		int marks = 322;
		if (marks>=40 && marks<=100) {
			System.out.println("Student has passed the exam");
		}else if(marks<39) {
			System.out.println("Student has failed the exam");
		}else {
			System.out.println("invalid number");
		}
		//Assign grade based on marks
		if(marks>=90 && marks<=100) {
			System.out.println("Distinction");
		}else if(marks>=70 && marks<=89){
			System.out.println("First class");
		}else if(marks>=40 && marks<=69) {
			System.out.println("Second class");
		}else {
			System.out.println("Fail");
		}
		//Create a simple calculator
		int num1 = sc.nextInt();
				
		//Check whether a year is a leap year
		//Check whether a number is even and greater than 50
		//Check whether a character is a vowel or consonant
		//Find the middle number among three numbers
		//Check whether a number is a two-digit number
		//Check whether a number is a three-digit number
		
		//Check whether a character is:
		//	Uppercase
		//	Lowercase
		//	Digit
		//	Special character
		
		//Check whether a number is positive AND even
	}

}
