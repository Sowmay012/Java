package SDR;

public class arraysum {
	static int arr[]= {12,3,4,15};
	
	static int sum()
	{
		int sum=0;
		int i;
		for(i=0;i<arr.length;i++)
			sum=sum+arr[i];
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of given array is:"+sum());

	}

}
