package Algorithms;

import java.util.Arrays;

public class Shift_Zeros_des {

	public static void main(String[] args) {
		int [] a= {5,9,8,0,5,0,4,0,8};
		int [] b=new int[a.length];
		int count=0;
		for(int j=0;j<a.length;j++) {
			 if(a[j]==0)count++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[count]=a[i];
				count++;
			}
		}		
		System.out.println(Arrays.toString(b));
	}

}
