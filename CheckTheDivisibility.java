package javaTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CheckTheDivisibility {

	static List<String> allPermutation;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String intString=sc.next();
		allPermutation=new ArrayList<>();
		findAllPermutation(intString, 0, intString.length()-1);
		
		//show all permutation
		for(String permute: allPermutation)
			System.out.print(permute+" ");
		
	}

	private static void findAllPermutation(String intString, int l, int r) {
		// TODO Auto-generated method stub
		if(l==r) {
			int value=Integer.valueOf(intString);
			if(value%8==0) {
				allPermutation.add(intString);
				System.out.println(intString +" in divisible by 8");
			}
			else
				allPermutation.add(intString);
		}
		else {
			for(int i=l;i<=r;i++) {
				intString=swap(intString, l, i);
				findAllPermutation(intString, l+1, r);
				intString=swap(intString, l, i);
			}
		}
	}

	private static String swap(String intString, int l, int i) {
		// TODO Auto-generated method stub
		char[] ch=intString.toCharArray();
		char c=ch[l];
		ch[l]=ch[i];
		ch[i]=c;
		return String.valueOf(ch);
	}

}
