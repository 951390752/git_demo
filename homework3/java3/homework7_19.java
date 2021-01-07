package java3;
import java.util.Scanner;
public class homework7_19 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list: ");
		
		int number=input.nextInt();
		int[] n=new int[number];
		
		for(int i=0; i<n.length; i++) {
			n[i]=input.nextInt();
		}
		input.close();
	
		if(isSorted(n))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		
	}
	
	public static boolean isSorted(int[] list) {
	
		for(int i=1; i<list.length-1 ; i++) {
			if(list[i-1] > list[i]) {
				return false;
			}
		}
		
		return true;
	}

}
