
//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
//Example 1:
//Input: num1 = "2", num2 = "3"
//Output: "6"

package Codility;

public class NoNegInteger {
	public void product(String s1, String s2)
	{
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		if(n1!=0 && n2!=0 && (n1<110 && n1>0) && (n2<110 && n2>0))
		{
			int product=n1*n2;
			String str=String.valueOf(product);
			System.out.println("Product of two number : "+str);
		}
		else
		{
			System.out.println("give number under the condition");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="2";
		String s2="11";
		NoNegInteger n = new NoNegInteger();
		n.product(s1, s2);
	}
}
