package javaTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SticksCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter length of sticks:");
		Integer[] sticks=new Integer[size];
		
		for(int i=0;i<size;i++) {
			sticks[i]=sc.nextInt();
		}
		
		List<Integer> l=new ArrayList<>();
		l.add(sticks.length);
		for(int i=0;i<size;i++) {
			sticks= findResult(sticks);
			if(sticks.length==0)
				break;
			else
				l.add(sticks.length);
		}
		
		//new Resultant Array or we can consider list as resultant
		Integer[] result=l.toArray(new Integer[l.size()]);
		for(Integer a:result)
			System.out.println(a+" ");
		
	}

	private static Integer[] findResult(Integer[] sticks) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		int min=findMin(sticks);
		for(int i=0;i<sticks.length;i++) {
			if(sticks[i]!=min)
				l.add(sticks[i]-min);
		}
		
		sticks=l.toArray(new Integer[l.size()]);
		return sticks;
	}

	private static int findMin(Integer[] sticks) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		for(int i=0;i<sticks.length;i++) {
			if(min>sticks[i])
				min=sticks[i];
		}
		return min;
	}

}
