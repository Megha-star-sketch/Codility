package Codility;

public class PalindromeInteger {
	public void Palindrome(int a)
	{
		int old,reverse=0,rem;
		old=a;
		while(a!=0)
		{
			rem=a%10;
			reverse=reverse*10+rem;
			a=a/10;
		}
		if(old==reverse)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
	
	public static void main(String args[])
	{
		int a=123;
		PalindromeInteger palin=new PalindromeInteger();
		palin.Palindrome(a);
	}

}
