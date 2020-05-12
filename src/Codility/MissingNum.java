//  Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
// Example 1:
// Input: [3,0,1]
// Output: 2

package Codility;

import java.util.Arrays;

public class MissingNum {
	public int Miss(int[] n)
	{
		int a=0,b=1,i,j,temp;
		// For sorting loop
		
//		for(i=0;i<n.length;i++)
//		{
//			for(j=0;j<n.length;j++)
//			{
//				if(n[i]<n[j])
//				{
//					temp=n[i];
//					n[i]=n[j];
//					n[j]=temp;
//				}
//			}
//		}
		Arrays.sort(n);
		 if (n[n.length-1] != n.length) {
	            return n.length;
	        }
		 else if (n[0] != 0) {
	            return 0;
	        }
		 
		for(i=0;i<n.length;i++)
		{
			if(n[i]!=a)
			{
				System.out.println(a);
				break;
			}
			a=a+b;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {9,5,2,6,8,4,0,1,3};
		MissingNum m = new MissingNum();
		m.Miss(n);
	}
}
