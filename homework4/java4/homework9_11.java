package java4;

public class homework9_11 {
	//** Main method */
	public static void main(String[] args) {
		// Declare circleArray
		homework9_8[] circleArray;
		
		// Create circleArray
		circleArray = createCircleArray();
		
		printCircleArray(circleArray);
	}
	
	public static homework9_8[] createCircleArray() {
		homework9_8[] circleArray= new homework9_8[5];
		 
		 for (int i = 0; i<circleArray.length;i++) {
			 circleArray[i] = new homework9_8(Math.random() * 100);
		 }
		 
		return circleArray;
	}
	
	public static void printCircleArray(homework9_8[] circleArray) {
		System.out.printf("%-30s&-15s\n","Radius","Area");
		for(int i =0;i < circleArray.length;i++) {
			System.out.printf("%-30f&-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());		
		}
		
		System.out.println("------------------------------------");
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
		}
	
	public static double sum(homework9_8[] circleArray) {
		double sum=0;
		
		for(int i = 0;i < circleArray.length; i++){
			sum += circleArray[i].getArea();
		}
		return sum;
	}
}
