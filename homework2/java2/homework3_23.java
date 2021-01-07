package java2;
import java.util.Scanner;
public class homework3_23 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a point with two coordinates:");
	    double point1 = input.nextDouble();
	    double point2 = input.nextDouble();
	    if (point1 <= 5 && point2 <= 2.5)
	        System.out.println("Point (" + point1 + ", " + point2 +") is in the rectangle");
	    else
	        System.out.println("Point (" + point1 + ", " + point2 +") is not in the rectangle");
	}
}
