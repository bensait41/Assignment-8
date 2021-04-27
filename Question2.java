package Assignment8;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		
		cube();

	}
	
	public static void cube() {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("input: ");
		int c=scan.nextInt();
		
		scan.close();
		
		int cube = c*c*c;
		
		System.out.print("output: " + cube);
		
	}

}
