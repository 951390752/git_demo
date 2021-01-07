package java3;

import java.util.Scanner;
public class homework7_17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入学生的个数： ");
		int n=input.nextInt();
		
		String[] name=new String[n];
		int[] scores=new int[n];
		
		for(int i=0; i<name.length; i++) {
			System.out.print("请输入"+i+"号学生的姓名和成绩： ");  
			name[i]=input.next();	
			scores[i]=input.nextInt();
			
		}
		
		java.util.Arrays.parallelSort(scores);
		
		for(int i=name.length-1; i>=0; i--) {
			System.out.println(scores[i]+": "+name[i]);
		}
		
	}

}
