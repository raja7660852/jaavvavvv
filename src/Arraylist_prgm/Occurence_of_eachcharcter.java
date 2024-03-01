package Arraylist_prgm;

import java.util.LinkedHashSet;
import java.util.Set;

public class Occurence_of_eachcharcter {
	
public static void main(String[] args) {
	String s="Sandeep reddy_v@ng@";
	Set<Character> s1 =new LinkedHashSet<>();
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i));
		s1.add(s.charAt(i));
	}
	System.out.println(s1);

	for(Character ch:s1)
		
	{
		int count=0;
	   for(int i=0;i<s.length();i++)
	   {
		   if(s.charAt(i)==ch)
		   {
			   count++;  
		   }
	   }
	   System.out.println(ch+" "+count);
	}
	
	
}
}
