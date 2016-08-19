

public class XiErSort
{
	public static void main(String[] args)
	{
		int[] arr={7,9,3,6,9,1,8,5,234,1223,2,63,84,52,999};
		xiErSort(arr,arr.length/2);
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	
	static void xiErSort(int[] A,int step)
	{
		if(step==1)
		{
			insertSort(A);
			return;
		}
		int n=A.length;
		
		int[] B=new int[A.length];
		int[] C=new int[A.length];
		int p=0;
		int l=0;
		int b=0;
		int f=0;
		for(int i=0;i<step; i++)
		{
			
			for(int j=i,q=p; j<A.length&&q<A.length; j+=step,q++)
			{
				B[q]=A[j];
				
				p++;
				
				//System.out.println(j);
			}
			int[] D=new int[p-l];
			for(int a=0,c=b; a<D.length; a++,c++)
			{
				D[a]=B[c];
				//System.out.println(D[a]);
		    }
			insertSort(D);
			for(int d=0,e=f; d<D.length; d++,e+=step)
				C[e]=D[d];
			
            f++;			
		    b=b+(p-l);
			l=p;
			
			
			
		}
		
		//for(int i=0; i<A.length;i++)
		//{
		//	System.out.println(C[i]);
		//}
		for(int i=0;i<A.length; i++)
		{
			A[i]=C[i];
		}
		
		xiErSort(A,step/2);
		
		
		
	}
	
	
	static void insertSort(int[] A)
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
		//for(int i=0;i<A.length;i++)
		//{
		//	System.out.println(A[i]);
		//}
		
	}
}








