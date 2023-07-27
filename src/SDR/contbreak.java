package SDR;

public abstract class contbreak {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			if(i>4 && i<8)
			{
				continue;
			}
			System.out.print(i+",");
		}
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
			break;
			}
			System.out.print(i+",");
		}
		System.out.println();
		first:
		for(int j=1;j<6;++j)
		{
			for(int k=1;k<5;++k)
			{
				if(j==3||k==2)
				{
					continue first;
				}
					System.out.println("j="+j+";k="+k);
				
			}
		}
		
	}

}
