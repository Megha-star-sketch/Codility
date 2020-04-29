package Codility;

public class TwoTop {
	public void top(int[] n)
	{
		int i,j,temp;
		for(i=0;i<n.length;i++)
		{
			for(j=0;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					temp=n[j];
					n[j]=n[i];
					n[i]=temp;
				}
			}
		}
		for(i=0;i<2;i++)
		{
			System.out.println("Two highest element : "+n[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,4,2,6,8};
		TwoTop t=new TwoTop();
		t.top(n);
		
	}

}
