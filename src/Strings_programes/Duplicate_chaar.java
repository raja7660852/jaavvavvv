package Strings_programes;

public class Duplicate_chaar {
	public static void main(String[] args) {
		String s="Mahabharatham";
		String s1=s.toLowerCase();
		System.out.println("actual string :"+s);
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(ch==s1.charAt(i))
				{
					count++;
				}
			}
			if(count>=1)// if(count==1)
			{
			//	System.out.println(ch+" is present "+count+" times");
				System.out.println(ch+" "+count);
			}
		}
	}

}
