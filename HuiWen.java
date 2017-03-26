package my.com.cn.test;

import java.util.Scanner;

public class HuiWen {
	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        String str = in.nextLine();
	     	        
	       isHuiWen(str);
	       
	 }

	private static void isHuiWen(String str) {
		String s = "Yes!";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length/2; i++) {
			if(ch[i]!=ch[ch.length-1-i]){
				s="No!";
				break;
			}			
		}
		System.out.println(s);
	}

}
