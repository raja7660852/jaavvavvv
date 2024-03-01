package Strings_programes;

public class Duplicate_charcters {
	public static void main(String[] args) {
		String s="Mahabharat";
		String s1=s.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;
			for(int i=0;i<=s1.length()-1;i++)
			{
				if(ch==s1.charAt(i))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(ch+"  "+count);
			}
		}
	}

}
