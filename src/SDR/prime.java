package SDR;

public class prime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=11;
		int count=0;
		if((n==1)||(n==0))
		{
			System.out.println("Invalid");
			return;
		}
		
		for(int i=2;i<=(n/2);i++)
			{
				int res=(n%i);
				if(res==0)
				{
					count++;
				}

			}
		if(count==0)
		{
			System.out.println("primeNo:"+n);
		}
		else
		{
		System.out.println("not prime");	
				
		}
		

	}

}
