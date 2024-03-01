
public class max_String {
	public static void main(String[] args) {
		String s="i am a test engineer";
		String[] s1=s.split(" ");
		 String max=s1[0];
		 for(int i=1;i<s1.length;i++)
		 {
			 if(s1[i].length()>max.length())
			 {
				 max=s1[i];
			 }
		 }
		 System.out.println(max);
		
	}

}
