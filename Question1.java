package Assignment8;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		
		plus();
		
		
	}
	
	
	public static void plus() {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter first number:");
		int num1=scan.nextInt();
		
		System.out.println("enter second number:");
		int num2=scan.nextInt();
		
		scan.close();
		
		int result = num1 + num2;
		
		System.out.println("result: " + result);
		
		
	}
	
	

}
