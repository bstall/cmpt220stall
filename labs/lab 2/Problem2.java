import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// Find future dates
		Scanner input = new Scanner(System.in);
		
		//Enter input
		System.out.println("Enter today day. Use 0 as Sunday through 6 as Saturday: ");
		int day = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int futureDay = input.nextInt();
		
		//Calculations of future day
		int future = (day + futureDay) % 7;
		
		String result = "";
		
		switch(day){
			case 0: result = "Sunday";
			break;
			case 1: result = "Monday";
			break;
			case 2: result = "Tuesday";
			break;
			case 3: result = "Wednesday";
			break;
			case 4: result = "Thursday";
			break;
			case 5: result = "Friday";
			break;
			case 6: result = "Saturday";
			break;
		
		}
		//Output
		if (future == 0){
			System.out.println("Today is " + result + " and the future day is Sunday.");
		}else if(future == 1){
			System.out.println("Today is " + result + " and the future day is Monday.");
		}else if(future == 2){
			System.out.println("Today is " + result + " and the future day is Tuesday.");
		}else if(future == 3){
			System.out.println("Today is " + result + " and the future day is Wednesday.");
		}else if(future == 4){
			System.out.println("Today is " + result + " and the future day is Thursday.");
		}else if(future == 5){
			System.out.println("Today is " + result + " and the future day is Friday.");
		}else if(future == 6){
			System.out.println("Today is " + result + " and the future day is Saturday.");
		}
	}

}
