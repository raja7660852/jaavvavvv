package Strings_programes;

public class Lowcharcters_count {
	public static void main(String[] args) {
		
	String s1="RaJiReDDy";
	int count=0;
	for(char ch ='a';ch<='z';ch++)
	{
		for(char i=0;i<s1.length();i++)
		{
			if(ch==s1.charAt(i))
				count++;
		}
	}
	System.out.println("low charcters : "+count);	
}

}
