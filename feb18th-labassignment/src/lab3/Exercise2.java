package lab3;
import java.lang.*;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer s= new StringBuffer(str);
		StringBuffer ans= s.reverse();
		String st=ans.toString();
		System.out.println(str+"|"+st);

	}

}
