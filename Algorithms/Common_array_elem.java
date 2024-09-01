package Algorithms;

public class Common_array_elem {

	public static void main(String[] args) {
		int []a= {5,8,9,7,4};
		int [] b= {8,7,1,5,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("{"+a[i]+" "+b[j]+"}");
				}
			}
		}

	}

}
