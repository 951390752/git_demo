package java3;

import java.util.Scanner;
public class homework7_17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������ѧ���ĸ����� ");
		int n=input.nextInt();
		
		String[] name=new String[n];
		int[] scores=new int[n];
		
		for(int i=0; i<name.length; i++) {
			System.out.print("������"+i+"��ѧ���������ͳɼ��� ");  
			name[i]=input.next();	
			scores[i]=input.nextInt();
			
		}
		
		java.util.Arrays.parallelSort(scores);
		
		for(int i=name.length-1; i>=0; i--) {
			System.out.println(scores[i]+": "+name[i]);
		}
		
	}

}
