//Write a program to remove a given character from String?

package Codility;

public class RemoveChar {
	public void RemChar(String s,char c)
	{
		char[] c1=s.toCharArray();
		int i,j=0,count=0;
		for(i=0;i<s.length();i++)
		{
			if(c1[i]!=c)
			{
				c1[j]=c1[i];
				j++;
			}
			else
			{
				count++;
			}
		}
		while(count>0)
		{
			c1[j++]='\0';
			count--;
		}
		System.out.println(c1);

	}
	
	public static void main(String args[])
	{
		String s="Kanchan";
		char c='a';
		RemoveChar r = new RemoveChar();
		r.RemChar(s, c);
	}

}
