// Given a string S, find length of the longest substring with all distinct characters.  For example, for input "abca", the output is 3 as "abc" is the longest substring with all distinct characters.

package Codility;

public class DistinctChar {
	public void Distinct(String s1)
	{
		char[] c=s1.toCharArray();
		int i,j;
		char temp;
		for(i=0;i<s1.length();i++)
		{
			for(j=0;j<s1.length();j++)
			{
				if(c[i]<c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		int counter=1;
		for(i=0;i<s1.length()-1;i++)
		{
			if(c[i]!=c[i+1])
			{
				counter++;
			}
		}
		System.out.println("Distinct Element : "+counter);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abababcdefababcdab";
		DistinctChar d = new DistinctChar();
		d.Distinct(s1);
	}

}
