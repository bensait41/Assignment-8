package Assignment8;

public class Question8 {

	public static void main(String[] args) {

		int nth=9;
			fib(nth);
	
	}
	
	public static void fib(int n) {
		
		int first=0;
		int second=1;
		int sum=0;
		
		for(int i=1; i<=n-1; i++){
			
			sum = first + second;
			second = first;
			first = sum;

		}
		
		System.out.println(sum);
		
		
	}
}
