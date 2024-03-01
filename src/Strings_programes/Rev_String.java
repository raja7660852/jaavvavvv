package Strings_programes;

import java.util.Scanner;

public class Rev_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String name");
		String s=sc.next();
//	String s="malayalam";
//	System.out.println(s.length());
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		 rev=rev+s.charAt(i);
	}
	if(s.equals(rev))
	{
		System.out.println("it is a palindrome");
	}else
	{
	System.out.println("it is not a palindrome");
	}
   }
}
