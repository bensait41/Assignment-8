package Assignment8;

public class Question16 {

	public static void main(String[] args) {

		System.out.println(simpleRoomBook(false,2,1,2018));
		
	}
	
	public static boolean simpleRoomBook(boolean isReserved, int mounth, int day, int year) {
		
		boolean isAvailable;
		
		if(isReserved) {	
			
			isAvailable=false;
			
		}else {
			
			
				if(mounth==7 && (day>=1 && day<=8) && year==2018) {		
					isAvailable=false;		
				}else {		
					isAvailable=true;	
				}
			
		}
		
		return isAvailable;
	}

}
