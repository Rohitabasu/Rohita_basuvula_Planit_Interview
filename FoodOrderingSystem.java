import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodOrderingSystem {
	
	public void displayRestaurantDetails(String str) {
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("pepperoni pizza","Awesome pizza place, pepperoni pizza, $20");
		map.put("burger", "wild burger joint, burger, $15");
		map.put("donut", "Sweet donut point,donut,$10");
		map.put("tacos", "Taco Bell,Taco,$5");
		map.put("banana cake", "Cake Place, Banana Cake,$10");
				
		
		String itemVal = str.toLowerCase();
	    if(map.get(itemVal)!= null) {
	    	System.out.println(map.get(itemVal));
	    }else{
	    	System.out.println("Selected Food item is not available in any restaurant.kindly choose some other item");
	    }
		
	}
	
	public static void main(String[] args) {
		FoodOrderingSystem fos = new FoodOrderingSystem();
		System.out.println("Hi,please enter a food item from menu::");
		System.out.println("pepperoni pizza" +"\r\n"+"burger"+"\r\n"+"donut"+"\r\n"+"tacos"+"\r\n"+"banana cake");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		fos.displayRestaurantDetails(input);
	}

}
