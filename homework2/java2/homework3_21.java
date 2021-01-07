package java2;
import java.util.Scanner;
public class homework3_21 {
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

	    System.out.print("Enter year: (e.g., 2012):");
	    int year = input.nextInt();
	    System.out.print("Enter month:");
	    int month = input.nextInt();
	    System.out.print("Enter the day of the month:");
	    int day = input.nextInt();
	    int week = 0;

	    if (month == 1) {
	        month = 13;
	        year -= 1;
	        week = (day + 26 * (month + 1) / 10 + (year % 100) +
	                (year % 100) / 4 + (year / 100) / 4 + (year / 100) * 5) % 7;
	    }
	    else if (month == 2) {
	        month = 14;
	        year -= 1;
	        week = (day + 26 * (month + 1) / 10 + (year % 100) +
	                (year % 100) / 4 + (year / 100) / 4 + (year / 100) * 5) % 7;
	    }
	    else
	        week = (day + 26 * (month + 1) / 10 + (year % 100) +
	                (year % 100) / 4 + (year / 100) / 4 + (year / 100) * 5) % 7;

	    switch(week) {
	        case 0:System.out.println("Day of week is Saturday"); break;
	        case 1:System.out.println("Day of week is Sunday"); break;
	        case 2:System.out.println("Day of week is Monday"); break;
	        case 3:System.out.println("Day of week is Tuesday"); break;
	        case 4:System.out.println("Day of week is Wednesday"); break;
	        case 5:System.out.println("Day of week is Thursday"); break;
	        case 6:System.out.println("Day of week is Friday"); break;

	    }
	}
}
