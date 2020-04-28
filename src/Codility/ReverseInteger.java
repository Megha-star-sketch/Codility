//Given a 32-bit signed integer, reverse digits of an integer.
//Example 1:
//Input: 123
//Output: 321
//Example 2:
//Input: -123
//Output: -321
//Example 3:
//Input: 120
//Output: 21

package Codility;

public class ReverseInteger {
	public void reverse(int n)
	{
		int rev=0,rem;
		System.out.println("Before Reverse : "+n);
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("After Reverse : "+rev);
	}
	public static void main(String args[])
	{
		int n=120;
		ReverseInteger r = new ReverseInteger();
		r.reverse(n);
	}
}
