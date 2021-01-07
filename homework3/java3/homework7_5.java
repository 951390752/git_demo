package java3;
import java.util.Scanner;
public class homework7_5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] f = new int[10];
		
		System.out.print("Enter ten numbers: ");
		int count=0;
		
		for(int i=1;i<10;i++){
			int number = input.nextInt();
			int j;
			for(j=0;j<count;j++){
				if(number==f[j]){
					break;
				}	
			}
			if(j==count){
				f[count]=number;
				count++;
			}
		}
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<count;i++){
			System.out.print(f[i]+" ");
		}
	}

}
