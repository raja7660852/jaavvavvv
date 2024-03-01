package module1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,c=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("its prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
