package SDR;

public class vowel 
{

	public static void main(String[] args) 
	{
		char[] vow= {'a','e','i','o','u'};
		char[] name= {'s','o','w','m','y','a'};
		char[] name1= {'s','w','m','y'};
		int str1=name1.length;
		int str=name.length;
		int i,len=5,count=0,count1=0;
		for(i=0;i<len;i++)
		{
			for(int j=0;j<str;j++)
			{
				if(vow[i]==name[j])
				{
					
					count++;
				
				}
			}
		}
		if(count==0)
		{
			System.out.println("Vowel is not present in first string");
		}
		else
		{
		System.out.println("Number of Vowel present in first is:"+ count);
		}
		for(int a=0;a<len;a++)
		{
			for(int b=0;b<str1;b++)
			{
				if(vow[a]==name1[b])
				{
					
					count1++;
				
				}
			}
		}
		if(count1==0)
		{
			System.out.println("Vowel is not present second string");
		}
		else
		{
		System.out.println("Number of Vowel present second string is:"+ count);
		}

	}

}
