package SDR;

public class pyrimidchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pyramid pattren");
		drawpyramid();

	}
	public static void drawpyramid()
	{
		char ch='A';
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
				System.out.print(ch);
				//ch++;
			}
			System.out.println();
			ch++;
		}
	}

}
