public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] A={10,0,1,5,2,9,6,4};
		inserSort(A);
	}
	
    static void inserSort(int[] A)
	{
		for(int i=1;i<A.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(A[j-1]>A[j])
				{
					int tem=A[j-1];
					A[j-1]=A[j];
					A[j]=tem;
				}
				else
				{
					break;
				}
			}
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		
	}
}