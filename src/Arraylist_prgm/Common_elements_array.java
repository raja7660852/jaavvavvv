package Arraylist_prgm;

import java.util.LinkedHashSet;
import java.util.LinkedList;


//wAP TO PRINT COMMON ELEMENTS FROM ARRAY USING COLLECTIONS


public class Common_elements_array {
	public static void main(String[] args) {
		int a1[]= {1,5,9,77,55};
		int a2[]= {55,9,66,875,5556};
		LinkedList<Integer>l1=new LinkedList<>();
		LinkedList<Integer>l2=new LinkedList<>();
		for(int i=0;i<a1.length;i++)
		{
			l1.add(a1[i]);	
		}
		System.out.println(l1);
		for(int i=0;i<a2.length;i++)
		{
			l2.add(a2[i]);
		}
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
//		l1.retainAll(l2);
//		System.out.println(l1);
	}
	

}
