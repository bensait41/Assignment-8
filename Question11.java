package Assignment8;

public class Question11 {

	public static void main(String[] args) {

		System.out.println(c_profits(100,1500));
		System.out.println(c_profits(20,5));
		System.out.println(c_profits(100,100));
	}

	public static String c_profits(int buy, int sell) {
		
		if(buyPrice(buy) < sellPrice(sell)) {
			 return "profit";
		}else if(buyPrice(buy) > sellPrice(sell)) {
			return "loss";
		}else{
			return "no loss";
		}
	
		

	}
	
	public static int buyPrice(int buy) {
		
		return buy;
	}
	
	public static int sellPrice(int sell) {
		
		return sell;
	}
	
	
}
