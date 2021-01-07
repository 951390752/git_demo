package java6;

public class homework11_5 {
	/** Main method */ 
	public static void main(String[] args){ 
	// Display circle and rectangle properties
		displayObject(new homework11_2(1, "red",false));
		displayObject(new homework11_3(1, 1,"black", true)); 
	}
	
	/** Display geometric object properties */
	public static void displayObject(homework11_1 object){
	System.out.println("Created on " + object.getDateCreated() +". Color is " + object.getColor());
	 }
}
