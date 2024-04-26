package Trees;

import java.util.Scanner;

public class BinarySearchTree {
	
	int value;
	public static node root;
	Scanner scan = new Scanner(System.in);
	
	class node {
		int data;
		node left;
		node right;
	}
	
	BinarySearchTree() {
		root = null;
	}
	
	void insertion() {
		node ptr = new node();
		System.out.print("Enter the data: ");
		value = scan.nextInt();
		
		ptr.data = value;
		ptr.left = null;
		ptr.right = null;
		
		if(root == null) root = ptr;
		
		else {
			node temp = root;
			while(true) {
				if(temp.data > ptr.data) {
					if(temp.left == null) {
						temp.left = ptr;
						break;
					}
					else {
						temp = temp.left;
					}
				}
				else {
					if(temp.right == null) {
						temp.right = ptr;
						break;
					}
					else {
						temp = temp.right;
					}
				}
			}
		}
		System.out.print("Record Inserted\n\n");
	}
	
	/*void deletion() {
		System.out.print("Enter the deleted element: ");
		value = scan.nextInt();
		
		node temp = searchNode(root, value);
		
		if(temp == null)
			System.out.print("Deleted element is not found.\n\n");
		
		if(temp.left == null && temp.right == null) {     					//leaf node
			node temp1 = root;
			while(true) {
				if(temp1.left != null && temp1.left.data == value) {
					temp1.left = null;
					System.out.print("Deleted element successfully.\n\n");
					break;
				}
				if(temp1.right != null && temp1.right.data == value) {
					temp1.right = null;
					System.out.print("Deleted element successfully.\n\n");
					break;
				}
				else if(temp1.data > value) {
					temp1 = temp1.left;
				}
				else {
					temp1 = temp1.right;
				}
			}
		}
		
		else if(temp.left == null || temp.right == null) {					//one child
			node temp1 = root;
			while(true) {
				if(temp1.left != null && temp1.left.data == value) {
					temp1.left = null;
					System.out.print("Deleted element successfully.\n\n");
					break;
				}
				if(temp1.right != null && temp1.right.data == value) {
					if(temp.left != null) {
						temp1.right = temp.left;
					}
					else {
						temp1.right = temp.right;
					}
					System.out.print("Deleted element successfully.\n\n");
					break;
				}
				else if(temp1.data > value) {
					temp1 = temp1.left;
				}
				else {
					temp1 = temp1.right;
				}
			}
		}
		
		else {																// both the children
			
		}
	}*/
	
	node deletion(node root, int value) {
		if(root == null) return null;
		else if(root.data > value) root.left = deletion(root.left, value);
		else if(root.data < value) root.right = deletion(root.right, value);
		else {
			if(root.left != null && root.right != null) {
				node temp = findMax(root.left);
				root.data = temp.data;
				root.left = deletion(root.left, root.data);
			}
			else {
				if(root.left == null) {
					root = root.right;
				}
				else if(root.right == null) {
					root = root.left;
				}
			}
		}
		System.out.print("Deleted element successfully.\n\n");
		return root;
	}
	
	node findMax(node temp) {
		while(temp.right != null) {
			temp = temp.right;
		}
		return temp;
	}
	
	void preOrderTraverse(node root) {
		if(root == null) return;
		
		System.out.print(root.data + " ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
	}
	
	void postOrderTraverse(node root) {
		if(root == null) return;
		
		postOrderTraverse(root.left);
		postOrderTraverse(root.right);
		System.out.print(root.data + " ");
	}
	
	void inOrderTraverse(node root) {
		if(root == null) return;
		
		inOrderTraverse(root.left);
		System.out.print(root.data + " ");
		inOrderTraverse(root.right);
	}
	
	void levelOrderTraverse() {
		node temp = root;
		LevelOrderQueue levelOrderQueue = new LevelOrderQueue();
		levelOrderQueue.insertion(temp.data);
		while(levelOrderQueue.front != null) {
			if(temp != null) {
				if(temp.left != null)
					levelOrderQueue.insertion(temp.left.data);
				if(temp.right != null)
					levelOrderQueue.insertion(temp.right.data);
				int value = levelOrderQueue.deletion();
				System.out.print(value + " ");
				if(levelOrderQueue.front != null)
					temp = searchNode(root, levelOrderQueue.front.value);
			}
		}
	}
	
	node searchNode(node root, int search) {
		if(root == null)
			return null;
		else if(root.data > search) {
			return searchNode(root.left, search);
		}
		else if(root.data < search) {
			return searchNode(root.right, search);
		}
		return root;
	}
	
	void searchNode() {
		System.out.print("Enter the search element: ");
		int search = scan.nextInt();
		boolean flag = false;
		
		node temp = root;
		while(true) {
			if(temp.data == search) {
				System.out.println("Searched element is found.\n");
				flag = true;
				break;
			}
			else if(temp.data > search) {
				if(temp.left == null) {
					break;
				}
				else {
					temp = temp.left;
				}
			}
			else {
				if(temp.right == null) {
					break;
				}
				else {
					temp = temp.right;
				}
			}
		}
		if(flag == false) {
			System.out.println("Searched element is not found.\n");
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int ch = 0;
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		while(ch != 8) {
			System.out.print("\n***************Operation on Binary Search Tree***************\n");
		    System.out.print("\n1. Insertion\n2. Deletion\n3. PreOrder Traverse");
		    System.out.print("\n4. PostOrder Traverse\n5. Inorder Traverse\n6. LevelOrder Traverse\n7. Search Node");
		    System.out.print("\n8. Exit");
		    System.out.print("\n\nEnter the choice:-");
		    ch = scan.nextInt();
		    
		    switch(ch) {
		    	case 1:
		    		binarySearchTree.insertion();
		    		break;
		    	case 2:
		    		System.out.print("Enter the deleted element: ");
		    		int value = scan.nextInt();
		    		root = binarySearchTree.deletion(root, value);
		    		break;
		    	case 3:
		    		System.out.print("PreOrder Traverse: ");
		    		binarySearchTree.preOrderTraverse(root);
		    		System.out.println("\n"); 
		    		break;
		    	case 4:
		    		System.out.print("PostOrder Traverse: ");
		    		binarySearchTree.postOrderTraverse(root);
		    		System.out.println("\n");
		    		break;
		    	case 5:
		    		System.out.print("InOrder Traverse: ");
		    		binarySearchTree.inOrderTraverse(root);
		    		System.out.println("\n");
		    		break;
		    	case 6:
		    		binarySearchTree.levelOrderTraverse();
		    		System.out.println("\n");
		    		break;
		    	case 7:
		    		binarySearchTree.searchNode();
		    		break;
		    	case 8:
		    		System.exit(0);
		    		break;
		    	default: System.out.print("\nPlease enter valid choice\n\n");
		    }
		}

	}

}
