import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class linkedList {
	Node head;

	class Node {
		protected char data;
		protected Node link;

		public Node() {
			link = null;
			data = 0;
		}

		public Node(char d, Node n) {
			data = d;
			link = n;
		}

		public void setLink(Node n) {
			link = n;
		}

		public void setData(char d) {
			data = d;
		}

		public Node getLink() {
			return link;
		}

		public char getData() {
			return data;
		}
	}

	protected Node start;
	protected Node end;
	public int size;

	public linkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	public void removeElement(int val) {
		Node temp = start;
		if (val == 0) {
			start = start.getLink();
			return;
		}
		for (int i = 0; i < val - 1; i++) {
			temp = temp.getLink();
		}
		temp.setLink(temp.getLink().getLink());
	}

	public void display() {

		Node ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}

	public void insertAtEnd(char val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			end.setLink(nptr);
			end = nptr;
		}
	}

}

public class Ld2_05_201rdb002 {
	public static int val;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Random rnd = new Random();
		char[] xd = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'w', 'v', 'x', 'y', 'z' };
		int count = 0;
		linkedList list = new linkedList();
		System.out.println("201rdb002 Pauls Brikmanis 5");
		System.out.println();
		for (int i=0;i<10;i++) {
        	int burts = rnd.nextInt(26); 
                list.insertAtEnd(xd[burts]);
                if(xd[burts]=='a'||xd[burts]=='e'||xd[burts]=='i'||xd[burts]=='o'||xd[burts]=='u'){
                    count++;
			}
		}
		System.out.println("List: ");
		list.display();
		System.out.println();
		System.out.println("The number of vowels is : " + count);
		System.out.println();
		System.out.println("Insert positions from 0 to 9 val= ");
		val = scan.nextInt();
		list.removeElement(val);
		list.display();
		System.out.println();

		scan.close();
	}
}
