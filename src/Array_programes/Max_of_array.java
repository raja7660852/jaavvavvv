package Array_programes;

import java.util.Scanner;

public class Max_of_array {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array ");
	int size=sc.nextInt();
	int a[]=new int[size];
	int max=a[0];
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
	
	
	}
}
