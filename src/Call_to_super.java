class Par
{
	String s;
public	Par(String s)
	{
	this.s=s;
		//System.out.println("parent imp");
		System.out.println(s);
	}
}

class Sub extends Par
{
	public Sub(String s1)
	{
		super(s1);
		System.out.println("sub imp");
	}
}
public class Call_to_super {
	public static void main(String[] args) {
		Sub  s=new Sub("raji");
		
	}

}
