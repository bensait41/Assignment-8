package Assignment8;

public class Question14 {

	public static void main(String[] args) {

		
		System.out.println(threeLocks(false, false, true));
										//false  ||  true
	}
	
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		
		if( (a && b) || c) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
