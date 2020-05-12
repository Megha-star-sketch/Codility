// Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
// Return 0 if the array contains less than 2 elements.

package Codility;

import java.util.Arrays;

public class MaxGap {
	public void Maximum(int[] n)
	{
		int temp[]=new int[n.length];
		int i,j,k=0;
		Arrays.sort(n);
		for(i=0;i<n.length-1;i++)
		{
			if(n[i]<n[i+1])
			{
				temp[k]=n[i+1]-n[i];
				k++;
			}
		}
		int local;
//		for(i=0;i<temp.length;i++)
//			{
//				for(j=0;j<temp.length;j++)
//				{
//					if(temp[i]>temp[j])
//					{
//						local=temp[i];
//						temp[i]=temp[j];
//						temp[j]=local;
//					}
//				}
//			}
		Arrays.sort(temp);
//		for(i=0;i<temp.length;i++)
//		{
//			System.out.println(temp[i]);
//		}
		System.out.println(temp[temp.length-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {3,6,9,7};
		MaxGap m = new MaxGap();
		m.Maximum(n);
	}

}
