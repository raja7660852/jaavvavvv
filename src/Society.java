class Parent
{
	public  static void marriage()
	{
		System.out.println("Arrange marriage");
	}
	public void name()
	{
		System.out.println("Hello");
	}
}
class kids extends Parent
{
	public  static void marriage()
	{
//	Parent p=new Parent();
//	p.name();
		System.out.println("love marrige");
	}
	public void name()
	{
		super.name();
		System.out.println("Bye");
	}
}
public class Society {
	public static void main(String[] args) {
//		Parent  p=new Parent();
//		p.marriage();
//		p.name();
		
		kids k=new kids();
		k.name();
		k.marriage();
		
//	Parent p1=new kids();
////		p1.name();
////		p1.marriage();
//		
//		kids k1=(kids)p1;
//		p1.name();
//		p1.marriage();
//		
		
		
		

		
	}

}
