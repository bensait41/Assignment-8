package Assignment8;

public class Question12 {

	public static void main(String[] args) {

		System.out.println(hamletQuote(true, false));
		System.out.println(hamletQuote(false, true));
		System.out.println(hamletQuote(true, true));
		System.out.println(hamletQuote(false, false));
		
	}
	
	public static boolean hamletQuote(boolean b1, boolean b2) {
		
		boolean trueOrFalse;
		
		if(b1 || b2) {
			trueOrFalse=true;
		}else {
			trueOrFalse=false;
		}
		
		return trueOrFalse;	
	}

}
