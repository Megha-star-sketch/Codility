//Write a Java program to get the character at the given index within the String.

package Codility;

public class StringPrac2 {
	public void Index(String s)
	{
		char[] c=s.toCharArray();
		System.out.println("The Character at first position : "+c[0]);
		System.out.println("The Character at 10th position : " +c[9]);
		System.out.println("The Character at last position : " +c[c.length-1]);
	}
	
	public static void main(String args[])
	{
		StringPrac2 s = new StringPrac2();
		String st="Java Exercise";
		s.Index(st);
	}
}
