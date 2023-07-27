package SDR;

public class arrayequal
{
	
	public boolean compArray(Integer[] arr1,Integer[] arr2)
	{
		if(arr1==null||arr2==null)
		{
			return false;
		}
		if(arr1.length!=arr2.length)
		{
			return false;
		}
		Integer[] sortedArr1=sortedArray(arr1);
		Integer[] sortedArr2=sortedArray(arr2);
		for(int i=0;i<sortedArr1.length-1;i++)
		{
			if(sortedArr1[i]!=sortedArr2[i])
			{
				return false;
			}
		}
		return true;
	}
		public Integer[] sortedArray(Integer[] arr)
		{
			for(int k=0;k<arr.length;k++)
			{
				for(int i=0;i<arr.length-1;i++)
				{
					if(arr[i]>arr[i+1])
					{
						int temp=0;
						temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
						
					}
						
					}
				}
		return arr;
	  }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Integer arr1[]= {1,2,3,6,4};
		Integer arr2[]= {3,2,1,4,6};
		arrayequal arrcomp=new arrayequal();
		boolean res=arrcomp.compArray(arr1, arr2);
		if(res==true)
		{
		System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
				
	
	}
}


