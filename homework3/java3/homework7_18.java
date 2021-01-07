package java3;

import java.util.Scanner;
public class homework7_18 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈë10¸öÊı£º ");
		double[] n=new double[10];
		for(int i=0; i<10; i++) {
			n[i]=input.nextDouble();
		}
		
		bubbleSort(n);
		
		input.close();
		
	}
 
	public static void bubbleSort(double[] n) {
		
		
		for(int i=0; i<n.length-1;i++) {
			for(int j=0; j<n.length-1-i; j++) {
				if(n[j]>=n[j+1]) {
					double temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
					
				}
			}
		}
		System.out.println("Ã°ÅİÅÅĞò£º");
		for(int k=0; k<n.length; k++) {
			System.out.printf(" %.1f ", n[k]);
		}
	}

}
