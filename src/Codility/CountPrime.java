// Count the number of prime numbers less than a non-negative number, n.

package Codility;

public class CountPrime {
	public void count(int n)
	{
		int i,j,flag=0,counter=0;
		for(i=3;i<n;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j!=0)
				{
					flag=1;
					//counter++;
				}
				else if(i%j==0)
				{
					break;
				}
			}
			if(flag==1)
			{
				counter++;
			}
					
		}
		System.out.println(counter);
//		if(flag==1)
//		{
//			System.out.println("Prime");
//		}
//		else
//		{
//
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		CountPrime c = new CountPrime();
		c.count(n);
	}
}
