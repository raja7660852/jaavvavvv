package Strings_programes;

public class Count_words {
	public static void main(String[] args) {
		String s="i am raj reddy";
		String s1=s.trim();
		int count=1;
		for(int i=0;i<s1.length();i++)
		{ 
			if(s1.charAt(i)==' '&& s1.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
