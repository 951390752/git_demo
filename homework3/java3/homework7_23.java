package java3;

public class homework7_23 {
	 public static void main(String[] args){
		 boolean[] num = new boolean[101];
		 for(boolean num1:num)
			 num1=false;
		 for(int i=1;i<=100;i++){
			 int base = i;
			 while(base<=100){
				 num[base] =! num[base];
				 base += i;
			 }
		 }
	 for(int i=1;i<=100;i++){
		 if(num[i])
			 System.out.print(i+" ");
	 }
	 }
}
