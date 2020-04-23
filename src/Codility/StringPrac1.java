package Codility;

public class StringPrac1 {
	public void string(String S, int[] C)
	{
		int count=0; int cost=0;
		String st=S.toLowerCase();
		int i=0;
		for(i=0;i<st.length()-1;i++)
		{
			if(st.charAt(i)==st.charAt(i+1))
			{
				count=i;
				int j=0;
				while(j<C.length)
				{
					if(j==count)
					{
						if(C[j]<=C[j+1])
						{
							cost+=C[j];
							j++;
						}
						else
						{
							cost+=C[j+1];
							j++;
						}
						
					}
					else
					{
						j++;
					}
				}
			}
		}System.out.println(cost);
	}
	public static void main(String args[])
	{
		StringPrac1 p = new StringPrac1();
		String S = "abbbbbbbaa";
		int[] C = new int[]{1,3,2,7,7,3,1,5,5,2};
		p.string(S,C);
	}

}
