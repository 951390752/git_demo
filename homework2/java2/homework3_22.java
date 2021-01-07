package java2;
import java.util.Scanner;
public class homework3_22 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a point with two coordinates:");
	    int point1 = input.nextInt();
	    int point2 = input.nextInt();
	    double sum = point1 * point1 + point2 * point2;
	    if (Math.pow(sum, 0.5) < 10)
	        System.out.println("Point (" + point1 + ", " + point2 +") is in the circle");
	    else
	        System.out.println("Point (" + point1 + ", " + point2 +") is not in the circle");
	}
}
