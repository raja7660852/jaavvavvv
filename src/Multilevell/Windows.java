package Multilevell;

 class Windows {
	public static void window8()
	{
		System.out.println("win 8 upgrade ");
	}
}
 class windowsup1 extends Windows
{
	public static void windows9()
	{
		System.out.println("windows 9 upgrade");
	}
}
 class windowsup2 extends windowsup1
 {
	 public  static void windows10() 
	 {
		 System.out.println("windows 10 upgrade");
	}
 }
 class op
{
	public static void main(String[] args) 
	{
	windowsup2 w=new windowsup2();
	w.windows10();
	w.windows9();
	w.window8();
		
	}
}