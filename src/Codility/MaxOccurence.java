//How to find the maximum occurring character in given String?

package Codility;

public class MaxOccurence {
	public void occur(String s1)
	{
		char[] arr = s1.toCharArray();
				int count = 1;
				int max = 0;
				char result = 0;
				for(int i=0; i<arr.length-1; i++){ 
				    if(arr[i]==arr[i+1]){
				        count++;
				    } else {
				        if(count>max){  
				            max=count;
				            result=arr[i];
				        }
				        count = 1; 
				    }
				}
				// This is for the last run
				if(count>max){
				    max=count; 
				    result=arr[arr.length-1];
				}
				System.out.println(max+" : times occur"+", for the character "+result);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ssg";
		MaxOccurence o=new MaxOccurence();
		o.occur(s1);
	}

}
