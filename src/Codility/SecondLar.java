// Find the 2nd largest element in an array.

package Codility;

public class SecondLar {
	public void SecLar(int[] lar)
	{
		int i,j,temp;
		for(i=0;i<lar.length;i++)
		{
			for(j=0;j<lar.length;j++)
			{
				if(lar[i]>lar[j])
				{
					temp=lar[i];
					lar[i]=lar[j];
					lar[j]=temp;
				}
			}
		}
		System.out.println(lar[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lar= {89,24,75,11,23};
		SecondLar l = new SecondLar();
		l.SecLar(lar);
	}

}
