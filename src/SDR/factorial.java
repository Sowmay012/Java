package SDR;

public class factorial {
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*fact(n-1));
		}
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int res=0;
		int num=5;
		
		res=fact(num);
		System.out.println("Factorial of a Number:"+num+" is "+res);
		
	}

}
