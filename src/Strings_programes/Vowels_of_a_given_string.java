package Strings_programes;

public class Vowels_of_a_given_string {
	public static void main(String[] args) {
		String s="king";
		String s1="aeiou";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=0;j<=s1.length()-1;j++)
			{
				if(s.charAt(i)==s1.charAt(j))
				{
				System.out.println(s.charAt(i));	//count++;
				}
			}
			if(count>0)
			{
				System.out.println(count);
			}
		}
		
	}

}
