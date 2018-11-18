package javaTrack;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class GetRidOfDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		
		Map<Integer, Integer> frequency=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(frequency.containsKey(array[i]))
				frequency.put(array[i], 1+frequency.get(array[i]));
			else
				frequency.put(array[i], 1);
		}
		//form new array without duplicates
		//show count of duplicates
		int[] newArray=new int[frequency.size()];
		int i=-1;
		for(Entry<Integer, Integer> e:frequency.entrySet()) {
			if(e.getValue()>1) {
				System.out.println("Element: "+e.getKey()+" No of Duplicates: "+(e.getValue()-1));
				newArray[++i]=e.getKey();
			}
			else
				newArray[++i]=e.getKey();
		}
		
		//show new array
		for(int j=0;j<=i;j++)
			System.out.print(newArray[j]+" ");
		System.out.println();
	}

}
