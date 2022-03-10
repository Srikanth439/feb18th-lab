package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	
	public static int getSecondSmallest(int[]arr) {
		List  a=Arrays.asList(arr);
		List list=new ArrayList(a);
		//list.addAll(a);
		
		Collections.sort(list);
		//System.out.println(list);
		//System.out.println(list.get(0));
		for(Object i: list) {
			System.out.println(i);
		}
		return 1;
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int n=sc.nextInt();
		System.out.println("Enter Integers");
		int[] arr=new int[n];
		int i=0;
		while(i<n) {
			arr[i]=sc.nextInt();
			i++;
		}
		System.out.println(getSecondSmallest(arr));
	}
		

}
