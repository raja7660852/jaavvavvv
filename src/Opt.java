
class A {
	public void eat()
	{
		System.out.println("i am eating");
	}

}
class B extends A
{
	public void drink()
	{
		System.out.println("im drinling");
	}
}

class C extends A
{
	public void sm()
	{
		System.out.println("im having puff");
	}
}
 public class Opt
{
	public static void main(String[] args) {
		 B b=new B();
		 b.eat();
		 b.drink();
		 C c=new C();
		 c.eat();
		 c.sm();	
	}
}

