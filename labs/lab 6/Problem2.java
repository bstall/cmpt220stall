import java.util.Calendar;
import java.util.GregorianCalendar;
public class Problem2 {

	public static void main(String[] args) {
		//Problem 9.5
		// Create calendar object
				GregorianCalendar calender = new GregorianCalendar();

				// Display the current date
				System.out.print("\nCurrent year, month, and day in format Mth/Day/Year: ");
				System.out.println(calender.get(Calendar.MONTH) + "/" +
					calender.get(Calendar.DAY_OF_MONTH) + "/" + calender.get(Calendar.YEAR));

				// Set elapsed time to 1234567898765L
				calender.setTimeInMillis(1234567898765L);

				// Display the date
				System.out.print("\nElapsed time since January 1, 1970 set to " +
					"1234567898765L in format Mth/Day/Year: ");
				System.out.println(calender.get(Calendar.MONTH) + "/" +
					calender.get(Calendar.DAY_OF_MONTH) + "/" + calender.get(Calendar.YEAR));
			}

	}


