package Algorithms;
import java.util.Arrays;

public class Bubble_sort_decending {
public static void sort(int[] a)
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]<a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;	
			}
		}
	}
}
public static void main(String[] args) {
	int[] a= {1,4,7,8,5,2,3,6,9};
	System.out.println(Arrays.toString(a));
	sort(a);
	System.out.println(Arrays.toString(a));
}
}
