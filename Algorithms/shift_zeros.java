package Algorithms;

import java.util.Arrays;

public class shift_zeros {

	public static void main(String[] args) {
		int [] a= {5,9,8,0,5,0,4,0,8};
		int [] b=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[j]=a[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(b));

	}

}
