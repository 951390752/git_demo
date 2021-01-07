package java2;
import java.util.Scanner;
public class homework3_19 {
	 public static void main(String[] args) {
	  	Scanner input = new Scanner(System.in);  
		System.out.print("Enter three sides:");  
	 	int side1 = input.nextInt();  
	 	int side2 = input.nextInt();  
	  	int side3 = input.nextInt();  
	   	if ((side1 + side2 > side3) && (side1 + side3 > side2)  
	    	&& (side2 + side3 > side1))  
	    	System.out.println("The circle is " + (side1 + side2 + side3));  
	    else  
	   		System.out.println("无法组成三角形.");  
	   }
}
