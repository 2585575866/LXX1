public class FastSort
{
	public static void main(String[] args)
	{
		int[] array={7,5,1,0,8,6,9,10};
		fastSort(array,0,array.length-1);
		for(int i=0;i<array.length;i++)
		{
	        System.out.println(array[i]);
		}
	}
	
	static void fastSort(int[] arr,int left,int right)
	{
		int base=arr[left];
		int i=left;
		int j=right;
		
		if(left>right)
			return;
		
		while(i<j)
		{
			while(arr[j]>=base&&i<j)
			{
					
				j--;
					
			}
			if(i<j)
			{
				arr[i]=arr[j];
				i++;
			}
				
				
				
			while(arr[i]<=base&&i<j)
			{
					
				i++;
					
			}
			if(i<j)
			{
				arr[j]=arr[i];
				j--;
			}	
				
				
		}
		arr[i]=base;
		//System.out.println(i);
		fastSort(arr,left,i-1);
	    fastSort(arr,i+1,right);	
		
		
	}	
		
		
}	
	
