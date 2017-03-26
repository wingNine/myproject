package my.com.cn.test;

import java.util.Scanner;

public class InOut {
	public static void main(String[] arr){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int k = in.nextInt();
		int[] num =new  int[m];
		
		for (int i = 0; i < m; i++) {
			num[i]=in.nextInt();
		}
		
		for (int i = 0; i < k; i++) {
			int[] temp =  num.clone();
			int t;
			for (int j = 0; j < num.length; j++) {
				t = temp[j]+temp[(j+1)%temp.length];
				if(t>100)
					t = t%100;
				
					num[j]=t;
								
			}
		}
		
		for (int i : num) {
			System.out.print(i+" ");
			
		}
	}
}
