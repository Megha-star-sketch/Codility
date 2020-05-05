// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

package Codility;

public class MoveNonZero {
	public void move(int[] arr)
	{
		int i,j=0;
		//int[] a=new int[5];
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[j]=arr[i];
				j++;
			}
		
		}
		while(j<arr.length)
		{
            arr[j++]=0;
		}
		for(j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,3,0,5};
		MoveNonZero m = new MoveNonZero();
		m.move(arr);
	}

}
