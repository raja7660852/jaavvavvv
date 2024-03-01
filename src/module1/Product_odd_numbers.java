package module1;

public class Product_odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0) 
			{
				j=i*j;
			}
		
		}
		System.out.println(j);


	}

	}


