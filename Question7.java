package Assignment8;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("input: ");
		int num = scan.nextInt();

		scan.close();

		System.out.println(isPalindrome(num));

	}

	public static boolean isPalindrome(int num) {

		 int r,sum=0,temp; 
		  
		  temp=num;   //34567
		  
			  while(num>0){    
				  
			   r=num%10; 
			   
			   sum=(sum*10)+r;    
			   
			   num=num/10;    
			   
			  }    
			  		//34567 
				  if(temp==sum) {
					  return true;
				  }else {
					  return false;
				  }
				  
				
	}

}
