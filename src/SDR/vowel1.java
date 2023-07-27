package SDR;

public class vowel1 {
	public static void main(String args[])
	{
		String str="java";
		char[] vow={'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<str.length();j++)
				
			{
				if((vow[i])==str.charAt(j))
						{
						count++;
						}
			}
			}
		if(count==0)
		{
			System.out.println("Not found");	
		}
		else
		{
		System.out.println("No. of vowels present is:"+count);
		}
	}
}
