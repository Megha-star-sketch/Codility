package Codility;

public class AcceptSingle {
	public void Accept(int[] num)
	{
		int temp,i,j;
		//This loop is for sorting
		for(i=0;i<num.length;i++)
		{
			for(j=0;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		//This loop is for checking the condition
		for(i=0;i<num.length-1;i++)
		{
			if(num[i]==num[i+1])
			{
				i++;
			}
			else
			{
				System.out.println(num[i]);
			}
		}
		if(num[num.length-1]!=num[num.length-2])
		{
			System.out.println(num[num.length-1]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {4,1,4,1,2};
		AcceptSingle a = new AcceptSingle();
		a.Accept(num);
	}

}
