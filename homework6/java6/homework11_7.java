package java6;

public class homework11_7 {
	/** Main method */ 
	public static void main(String[] args) { 
	// Create and initialize two objects
	 Object object1 = new homework11_2(1); 
	 Object object2 = new homework11_3(1, 1);
	 
	 // Display circle and rectangle
	 displayObject(object1);
	 displayObject(object2);
}
	/** A method for displaying an object */
	public static void displayObject(Object object) {
	if (object instanceof homework11_2) {
		System.out.println("The circle area is " +((homework11_2)object).getArea());
		System.out.println("The circle diameter is " +((homework11_2)object).getDiameter());
	 }
	 else if (object instanceof homework11_3) {
		System.out.println ("The rectangle area is " +((homework11_3)object).getArea());
	 }
	}		
}
