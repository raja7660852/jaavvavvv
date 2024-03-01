package Encapsulation;

 class Demo {
	private String carname,carbrand;
	
	public void setcarname(String carname)
	{
		this.carname=carname;
	}
	public void setcarbrand(String carbrand)
	{
		this.carbrand=carbrand;
	}
	
	public String getcarname()
	{
		if(carname.equals("benz a3"))
		{
			return "it  is right model";
		}
		else
		{
			return "it is wrong model" ;
		}
			
		
	}
	public String getcarbrand()
	{
	if(carbrand.equals("benz"))
	{
		
		return "right brand";
		
	}
	else
	{

	return "wrong brand";
}
}
}
 public class Car
{
	public static void main(String[] args) {
		Demo c=new Demo();
		c.setcarbrand("benz");
		c.setcarname("benza3");
		System.out.println(c.getcarbrand());
		System.out.println(c.getcarname());
		
		
	}
}


