package module1;

public class Sum_of_Evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) 
			{
				j=i+j;
			}
		
		}
		System.out.println(j);


	}

}
