package Exceptions;

public class Intrepted_exception {
	public static void main(String[] args) {
		for (char ch='A';ch<='Z';ch++)
		{
			System.out.println((int)ch);
			try
			{
				Thread.sleep(2000);	
			}
			catch(Exception p)
			{
				System.out.println("handeled");
			}
			
		}
	}

}
