package Assignment8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num=scan.nextInt();
		
		scan.close();
		
		System.out.println(sign(num));

		
	}
	
	public static int sign(int num) {
		

		if(num>0) {
			num=1;
		}else if(num==0){
			num=0;
		}else if(num<0) {
			num=-1;
		}
		
		return num;
	}

}
