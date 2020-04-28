
//Implement strStr().
//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//Example 1:
//Input: haystack = "hello", needle = "ll"
//Output: 2
//Example 2:
//Input: haystack = "aaaaa", needle = "bba"
//Output: -1


package Codility;

public class ReturnStIndex {
	public void indexString(String s1, String needle)
	{
		int i,j,flag=0;
		char[] c1=s1.toCharArray();
		char[] c2=needle.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			if(c1[i]==c2[0])
			{
				flag=0;
					break;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("-1");
		}		
		else
		{
			System.out.println("Index : "+i);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Vishal";
		String needle="m";
		if(needle=="")
		{
			System.out.println("String is empty");
		}
		ReturnStIndex st=new ReturnStIndex();
		st.indexString(s1, needle);
	}

}
