import java.util.*;

public class Weekdays{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What day is it?");
		String day = sc.nextLine().toLowerCase()); 
		
		switch(day){
			case "monday" -> "It is a weekday";
			case "tuesday" -> "It is a weekday";
			case "wednesday" -> "It  is a weekday";
			case "thursday" -> "It is a weekday";
			case "friday" -> "It is a weekday";
			case "saturday" -> "It is the weekend";
			case "sunday" -> "It is the weekend";
	
		}
		
	}

}