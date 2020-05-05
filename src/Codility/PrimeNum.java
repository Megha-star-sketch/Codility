//How to check whether a number is prime or not

package Codility;

public class PrimeNum {
	public void prime(int n)
	{
		int i,flag=0;
		for(i=2;i<n;i++)
		{
			if(n%i!=0)
			{
				flag=1;
			}
			else if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		PrimeNum p = new PrimeNum();
		p.prime(n);
	}

}
