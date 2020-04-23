
//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
//Example 1:
//Given nums = [3,2,2,3], val = 3,
//Your function should return length = 2, with the first two elements of nums being 2.

package Codility;

public class RemoveEle {
	public void remove(int[] arr,int n,int val)
	{
		int[] a=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=val)
			{
				a[j++]=arr[i];
			}
		}
		if(arr[n-1]!=val)
		{
			a[j++]=arr[n-1];
		}
		for(j=0;j<a.length-3;j++)
		{
			System.out.println(a[j]);
		}
		System.out.println("Size of an array : "+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,2,5,2};
		int val=2;
		int n=arr.length;
		RemoveEle e = new RemoveEle();
		e.remove(arr, n, val);
	}
}
