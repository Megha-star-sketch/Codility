// Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
//If the fractional part is repeating, enclose the repeating part in parentheses.
//Example 1:
//Input: numerator = 1, denominator = 2
//Output: "0.5"

package Codility;
public class Fraction {
	public void Frac(int num, int deno)
	{
		int res=0;
		  res=num/deno;
		 // String str=Float.toString(res);
		  String str=String.valueOf(res);
		  System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		int deno=2;
		Fraction f = new Fraction();
		f.Frac(num, deno);
	}
}
