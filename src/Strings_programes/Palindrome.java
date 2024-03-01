package Strings_programes;

public class Palindrome {
	public static void main(String[] args) {
	String s1= "Mom";
	System.out.println(s1.length());
	String s2="";
	System.out.println(s2);
	for(int i=s1.length()-1;i>=0;i-- )
	{
		char ch=s1.charAt(i);
		s2=s2+ch;
	}
	System.out.println(s2);
	if(s1.equals(s2))
	{
		System.out.println("palindrome string:"+s1);
	}
	else {
		System.out.println("not a palindrome:"+s1);
	}

}
}
