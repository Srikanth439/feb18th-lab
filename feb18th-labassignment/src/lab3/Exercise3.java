package lab3;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		String o="aeiouAEIOU";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(o.indexOf(ch[i])==-1) {
				ch[i]=(char)(ch[i]+1);
				}
		}
		String s=String.valueOf(ch);
		System.out.println(s);
		
	}

}
