package Array_programes;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array )..(");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			int count = 0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			System.out.println(a[i]+" is a prime number");
			

}
	}
	}
