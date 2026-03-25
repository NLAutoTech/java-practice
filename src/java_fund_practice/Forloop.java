package java_fund_practice;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print numbers 1 to 100.
				for (int i=1;i<=100;i++) {
					System.out.println(i);
				}
				
		//Print numbers 100 to 1 (reverse).
				for (int i=100;i>=0;i--) {
					System.out.println(i);
				}

		//Print even numbers from 1 to 50.
				for (int i= 1;i<=50;i++) {
					if(i%2==0) {
						System.out.println(i);
					}
				}
			
		//Print odd numbers from 1 to 50.
				for(int i=1;i<=50;i++) {
					if(i%2!=0) {
						System.out.println(i);
					}
				}

		//Print numbers divisible by 5 between 1 and 100.
				for(int i =1;i<=100;i++) {
					if(i%5==0) {
						System.out.println(i);
					}
				}
				
		//Find the sum of numbers from 1 to 100.
				int sum =0;
				for(int i=1;i<=100;i++) {
					sum =sum +i;
				}
				System.out.println(sum);
				
		//Find the sum of even numbers from 1 to 50.
				int sum1 =0;
				for (int i =1;i<=50;i++) {
					if(i%2==0) {
						sum1=sum1+i;
					}
				}
				System.out.println(sum1);	
				
		//Print table 1 to 5
				for(int i =1;i<=5;i++) {
					System.out.println("Table of  "+i);
					for(int j=1;j<=10;j++) {
						System.out.println(i+ " x "+j+" = "+(i*j));
					}
				}

		//Print numbers 1 to 100, but skip numbers divisible by 3.
				for(int i =1;i<=100;i++) {
					if(i%3==0) {
						continue;
					}
					System.out.println(i);
				}
				
		//Print numbers 1 to 50, replace multiples of 5 with "Five".
				for(int i= 1;i<=50;i++) {
					if(i%5==0) {
						System.out.println("Five");
					}else {
						System.out.println(i);
					}
				}
			
		//Count how many numbers are divisible by 7 between 1 and 100.
				int count =0;
				for(int i=1;i<=100;i++) {
					if(i%7==0) {
						count++;
					}
					
				}
				System.out.println("Count = "+ count);
				
				
						
	}

}
