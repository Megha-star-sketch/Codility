//How do you check if two strings are anagrams of each other?
//Example: s1=Silent and s2=Listen


package Codility;

public class CheckAnagram {
	public void checkAna(String s1, String s2)
	{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		int i=0,j=0;
		char temp;
		for(i=0;i<s1.length();i++)
		{
			for(j=0;j<s1.length();j++)
			{
				if(c1[i]<=c1[j])
				{
					temp=c1[j];
					c1[j]=c1[i];
					c1[i]= temp;
				}
			}
		}
		System.out.println(c1);
		for(i=0;i<s2.length();i++)
		{
			for(j=0;j<s2.length();j++)
			{
				if(c2[i]<=c2[j])
				{
					temp=c2[j];
					c2[j]=c2[i];
					c2[i]= temp;
				}
			}
		}
		System.out.println(c2);
		if(c1==c2)
		{
			System.out.println("Its is anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Silent";
		String s2="Listen";
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();
		CheckAnagram a = new CheckAnagram();
		a.checkAna(s3, s4);
	}

}
