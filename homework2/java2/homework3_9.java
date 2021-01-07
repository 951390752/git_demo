package java2;
import java.util.Scanner;
public class homework3_9 {
	public static void main(String[] args) {
	int num, last;
	String str, isbn;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first 9 digits of an ISBN as integer: ");
	num = input.nextInt();
 
	str = "0" + String.valueOf(num).toString();
 
	last = ((Integer.valueOf(str.substring(0, 1)).intValue() * 1) +
			(Integer.valueOf(str.substring(1, 2)).intValue() * 2) +
			(Integer.valueOf(str.substring(2, 3)).intValue() * 3) +
			(Integer.valueOf(str.substring(3, 4)).intValue() * 4) +
			(Integer.valueOf(str.substring(4, 5)).intValue() * 5) +
			(Integer.valueOf(str.substring(5, 6)).intValue() * 6) +
			(Integer.valueOf(str.substring(6, 7)).intValue() * 7) +
			(Integer.valueOf(str.substring(7, 8)).intValue() * 8) +
			(Integer.valueOf(str.substring(8, 9)).intValue() * 9)) % 11;
 
	if (last == 10) {
    isbn = str + "X";
	} 
	else {
		isbn = str + String.valueOf(last).toString();
	}
	System.out.println("The ISBN-10 number is " + isbn);
}
}
