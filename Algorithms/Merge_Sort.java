package Algorithms;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {
		int [] a= {0,1,2,5,4,78,9,6,3,2};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int []a)
	{
		if(a.length==1) return;
		int []left=new int[a.length/2];
		int [] right=new int[a.length-left.length];
		for(int i=0;i<left.length;i++)
		{
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=a[left.length+j];
		}
		sort(left);
		sort(right);
		merge(left, right,a);
	}
	
	public static void merge(int []left,int []right,int []a)
	{
		int i=0;
		int j=0;
		int k=0;
	while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				a[k++]=left[i++];
			}
			else
			{
				a[k++]=right[j++];
			}
		}
		while(i<left.length)
		{
			a[k++]=left[i++];
		}
		while(j<right.length)
		{
			a[k++]=right[j++];
		}
	
	}
}
