public class BubbleSort
{
	public static void main(String[] args)
	{
		//int[] arr={66,6,5,252,643,52,734,2562,25,73,73489,234,444};
		int[] arr={2,1,3,4,5,6};
		bubbleSort(arr);
	}
	
	static void bubbleSort(int[] arr)
	{
		boolean flag;
		for(int i=0; i<arr.length-2; i++)
		{
			flag=false;
			for(int j=arr.length-1; j>i; j--)
			{
				
				if(arr[j-1]>arr[j])
				{
					int tem=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tem;
					
					flag=true;
				}
				
			}
			if(flag==false)
				break;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}