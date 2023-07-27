package SDR;

public class polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abba";
		String str2="";
		int len=str1.length();
		for(int i=len-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		if(str1.equals(str2))
		{
			System.out.println("Polyindrome:"+str1);
		}
		else
		{
			System.out.println("Not Polyindrome");
	
		}
	}

}
