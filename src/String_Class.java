
public class String_Class {
public static void main(String args[])
{
	String s="I am Test Engineer";
	String s1=s.trim();
	int count=1;
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)==' '&&s1.charAt(i+1)!=' ')
		{
			count++;
		}
		//count++;
	}
	int i=s1.indexOf(4);
	System.out.println(i);
	System.out.println(count);
}
}
