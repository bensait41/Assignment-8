package Assignment8;

public class Question15 {

	public static void main(String[] args) {

		System.out.println(validateTask(true,3,2));
		
	}
	
	public static boolean validateTask(boolean b, int taskID, int currentID) {
		
			if(b) {
				
				
				if(taskID==currentID+1) {				
					return true;				
				}else {				
					return false;
				}
				
				
			}else {
				return false;		
			}
	}

}
