package Array_programes;

import java.util.Scanner;

public class Sum_of_evennumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array )..(");
		int size=sc.nextInt();
		int a[]=new int[size];
		int sum = 0;
		System.out.println(a.length);
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
			if(a[i]%2==0)
			{
				sum=sum+a[i];
				
			}

		}
		System.out.println("even numbers : "+sum);	
		
	}

}
