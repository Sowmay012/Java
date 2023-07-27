package SDR;

public class sortarray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int []arr= new int[]{2,4,1,7,5};
		int temp=0;
		System.out.print("Array elements before sorting:");
		for(int a=0;a<arr.length;a++)
		{
			System.out.print(arr[a]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				}
		}
		System.out.println();
		System.out.print("Array elements After sorting:");
		for(int b=0;b<arr.length;b++)
		{
			System.out.print(arr[b]);
		}
		
	}
		
}
