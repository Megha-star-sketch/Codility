package Codility;


public class RemoveDuplicate {
		public void removeDuplicate(int[] nums)
		{
			
			int[] n=new int[5];
			int i,j=0;
			for(i=0;i<nums.length-1;i++)
			{
				if(nums[i]!=nums[i+1])
				{
					n[j]=nums[i];
					j++;
				}
			}
			n[j++]=nums[nums.length-1];
			for(j=0;j<n.length;j++)
			{
				System.out.println(n[j]);
			}
			System.out.println("Total length of String after remove duplicate element : "+j);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			RemoveDuplicate l=new RemoveDuplicate();
			int[] nums= new int[]{1,2,2,4,4,4,6,7};
			l.removeDuplicate(nums);
		}
	


}
