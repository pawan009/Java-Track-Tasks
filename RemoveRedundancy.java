package javaTrack;

import java.util.Scanner;

public class RemoveRedundancy {

	static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of noodes you want to enter: ");
		int n=sc.nextInt();
		System.out.println("Enter Elements:");
		
		for(int i=0;i<n;i++) {
			insert(sc.nextInt());
		}
		
		removeRedundancy();
		//After redundancy
		while(head!=null) {
			System.out.print(head.key+" ");
			head=head.next;
		}
		
	}

	private static void removeRedundancy() {
		// TODO Auto-generated method stub
		Node node =head;
		while(node.next!=null) {
			if(node.key==node.next.key) {
				node.next=node.next.next;
			}
			else
				node=node.next;
		}
	}

	private static void insert(int key) {
		// TODO Auto-generated method stub
		if(head==null)
			head=new Node(key);
		else {
			Node node=head;
			while(node.next!=null)
				node=node.next;
			node.next=new Node(key);
		}
		
	}
	
}

class Node{
	int key;
	Node next;
	Node(int key){
		this.key=key;
		this.next=null;
	}
}