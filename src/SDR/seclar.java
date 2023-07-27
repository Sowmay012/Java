package SDR;

public class seclar {
		public static void main(String[] args)
		{
			int temp,size;
			int array[]= {10,40,63,96,50,80};
			size=array.length;
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					if(array[i]>array[j])
					{
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
			System.out.println("Second largest number:"+array[size-1]);

	}

}
