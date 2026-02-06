package study;
// learnt about variable class, main class;
public class Day01 {

	public static void main(String[] args) {
//		Write a Java program to print your name.
		System.out.println("My name is Nidhi");

//		Write a Java program to add two numbers.
		int a= 10,b=20;
		int sum =a+b;
		System.out.println("Sum of 2 Numbers= "+sum);
		
//		Write a Java program to multiply two numbers.
		int mul = a*b;
		System.out.println("Multiplication of 2 numbers = "+mul);
		
//		Write a Java program to swap two numbers using a temporary variable.
		int y= 10;
		int z= 40;
		int temp= y;
		y=z;
		z= temp;
	
		System.out.println("After Swapping Y= "+y+" Z = "+z);
		
//		Write a Java program to calculate the area of a circle.
		int rad = 15;
		double areac= 3.14*rad*rad;
		System.out.println("Area of cirlce = "+areac);
//		Write a Java program to calculate simple interest.
		int p= 10;
		int r = 20;
		int t=12;
		double si= (p*r*t)/100;
		System.out.println("Simple Interest = "+si);
//		Write a Java program to convert kilometers to miles.
//		Write a Java program to convert Celsius to Fahrenheit.
//		Write a Java program to check whether a number is even or odd.
//		Write a Java program to check whether a number is positive, negative, or zero.

		
		String atr = "Apple";
		String br = "le";

		System.out.println("hello  "+atr.compareTo(br)); // negative value

	}

}
