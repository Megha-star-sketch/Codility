package Codility;

public class ReturnStIndex {
	public void indexString(String s1, String needle)
	{
		int i,j;
		char[] c1=s1.toCharArray();
		char[] c2=needle.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			if(c1[i]==c2[0])
			{
					System.out.println("Index : "+i);
					break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Megha";
		String needle="ha";
		if(needle=="")
		{
			System.out.println("String is empty");
		}
		ReturnStIndex st=new ReturnStIndex();
		st.indexString(s1, needle);
	}

}
