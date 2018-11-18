package javaTrack;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LetsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(array[j]>array[j+1]) {
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
			}
		}
		Map<Integer, Integer> frequency=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(frequency.containsKey(array[i]))
				frequency.put(array[i], 1+frequency.get(array[i]));
			else
				frequency.put(array[i], 1);
		}
		
		//Sorted List
		for(int i=0;i<n;i++)
			System.out.print(array[i]+" ");
		System.out.println();
		
		//frequency
		for(Entry<Integer, Integer> e : frequency.entrySet()) {
			System.out.println("Key: "+e.getKey()+" Frequency: "+e.getValue());
		}
		
	}

}
