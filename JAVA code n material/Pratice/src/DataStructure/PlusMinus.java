package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
	
	class BinaryTree {
		BinaryTree left;
		BinaryTree right;
		int data;
	}
	
	BinaryTree root;
	
	BinaryTree left() {    
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
	BinaryTree right() {  
		while(root.right != null) {
			root = root.right;
		}
		return root;
	}
	
	void insert(int data) {
		BinaryTree node = new BinaryTree();
		if(root == null) {
			node.data = data;
			root = node;
		}
		else {
			BinaryTree root = left();
			node.data = root.data + data;
			root.left = node;
			node.data = root.data - data;
			root.right = node;
			
			root = right();
			node.data = root.data + data;
			root.left = node;
			node.data = root.data - data;
			root.right = node;
		}
	}
	
	void inOrderTraversal(BinaryTree root) {
		if(root == null)
			return;
		
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}
	
	public void separateDigit(int n) {
		
		List<Integer> list = new ArrayList<Integer>();
		while(n != 0) {
			list.add(n % 10);
			n /= 10;
		}
		Collections.reverse(list);
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			insert(list.get(i));
		}
		
		inOrderTraversal(root);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PlusMinus plusMinus = new PlusMinus();
		plusMinus.separateDigit(n);
		
		sc.close();
	}

}
