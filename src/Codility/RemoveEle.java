
//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
//Example 1:
//Given nums = [3,2,2,3], val = 3,
//Your function should return length = 2, with the first two elements of nums being 2.

package Codility;

public class RemoveEle {
	public int removeElement(int[] arr, int val) {
	    int i = 0;
	    for (int j = 0; j < arr.length; j++) {
	        if (arr[j] != val) {
	            arr[i] = arr[j];
	            i++;
	        }
	    }
	    System.out.println("New llength : "+i);
	    return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,2,5,2};
		int val=2;
		RemoveEle e = new RemoveEle();
		e.removeElement(arr, val);
	}
}
