package SDR;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0,i,res;
		int arr[]= {1,4,6,7,8,9};
		int len=arr.length;
		
		for(i=0;i<len;i++)
		{
			if(arr[i]==1)
				count++;
			else
			{
				res=arr[i]%2;
				if(res!=0)
				{
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("No odd numbers");
		}
		else
		{
			System.out.println("No. of odd numbers:"+count);	
		}

	}

}
