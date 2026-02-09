package java_fund_practice;

import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Check whether a number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
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
	}

}
