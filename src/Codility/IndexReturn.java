
//Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You may assume no duplicates in the array.
//Example 1:
//Input: [1,3,5,6], 5
//Output: 2
//Example 2:
//Input: [1,3,5,6], 2
//Output: 1

package Codility;
public class IndexReturn {
	public void returnIndex(int arr[],int target)
	{
		int n=arr.length;
		int i;
		for(i=0;i<n;i++)
		{
			if(arr[i]==target)
			{
				System.out.println(i);
				break;
			}
			else
			{
				if(target<arr[i])
				{
					System.out.println(i);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,3,5,7,9};
		int target=8;
		IndexReturn r = new IndexReturn();
		r.returnIndex(arr, target);
	}

}
