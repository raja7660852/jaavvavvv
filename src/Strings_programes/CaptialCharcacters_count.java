package Strings_programes;

public class CaptialCharcacters_count {
	public static void main(String[] args) {
		String s1="RaJiReDDy";
		int count=0;
		for(char ch ='A';ch<='Z';ch++)
		{
			for(char i=0;i<s1.length();i++)
			{
				if(ch==s1.charAt(i))
					count++;
				System.out.println();
			}
			
		}
		System.out.println("capital charcters : "+count);
		
		
		
	}

}
