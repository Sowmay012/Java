package SDR;
import java.util.Arrays;

public class MergeSort 
{
	void merge(int array[],int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;
		
		int l[]=new int[n1];
		int m[]=new int[n2];
		
		for(int i=0;i<n1;i++)
			l[i]=array[p+i];
		for(int j=0;j<n2;j++)
			m[j]=array[q+1+j];
		
		int i,j,k;
		i=0;
		j=0;
		k=p;
		
		while(i<n1 && j<n2)
		{
			if(l[i]<=m[j])
			{
				array[k]=l[i];
				i++;
			}
			else
			{
				array[k]=m[j];
				j++;
			}
			k++;
		}
		
		while(j<n2)
		{
			array[k]=m[j];
			j++;
			k++;
		}
	}
	
	void mergesort(int array[],int left,int right)
	{
		if(left<right)
		{
			int mid=(left+right)/2;
			
			mergesort(array,left,mid);
			mergesort(array,mid+1,right);
			
			merge(array,left,mid,right);
		}
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] array= {6,7,12,10,44,1};
		MergeSort ob=new MergeSort();
		ob.mergesort(array, 0,array.length-1);
		System.out.println("Sorted array");
		System.out.println(Arrays.toString(array));
	}
	
}
		
		
