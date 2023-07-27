package SDR;

public class fib {

	public static void main(String[] args)
	{
		int i,a=0,b=1,res;
		int n=3;
		if(n>=1)
		{
		System.out.println("Fibbanic Series:");
		System.out.print(a+",");
		System.out.print(b);
		
		for(i=1;i<=n;i++)
		{
			res=a+b;
			System.out.print(","+res);
			a=b;
			b=res;
		}
		}
		else
		{
			System.out.println("Invalid no.");
		}
		
		

	}

}
