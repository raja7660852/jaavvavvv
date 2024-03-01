package Array_programes;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size=sc.nextInt();
		int a[]=new int[size];
	//	int temp=0;
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			int temp=0;
			for(int j=0;j<a.length-1;j++)
                                  
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
			}
		

        }
		for(int k=0;k<=a.length-1;k++)
		{
			System.out.println(a[k]);
		}
	}
}
