package Algorithms;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		int []a= {5,8,2,1,5,9};
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>-1 && a[j]<key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		System.out.println(Arrays.toString(a));

	}

}
