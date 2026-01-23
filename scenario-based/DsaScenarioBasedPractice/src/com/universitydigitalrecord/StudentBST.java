package com.universitydigitalrecord;

public class StudentBST {
	private StudentNode root;
	
	//Insert Students
	public void insert(int rollNo, String name) {
		
			root = insertRecord(root, rollNo, name);
		
	}

	private StudentNode insertRecord(StudentNode root ,int rollNo, String name) {
		if(root == null) {
			return new StudentNode(rollNo, name);
		}
		if(rollNo < root.rollNo) {
			root.left = insertRecord(root.left, rollNo, name);
		}else if(rollNo > root.rollNo) {
			root.right = insertRecord(root.right, rollNo, name);
		}return root;
		
	}
	
	
	//Search Students
	public StudentNode search(int rollNo) {
		System.out.println("\nSearch performed");
		return searchRecord(root, rollNo);
	}

	private StudentNode searchRecord(StudentNode root,int rollNo) {
		if(root == null || root.rollNo == rollNo) {
			return root;
		}
		if(rollNo < root.rollNo) {
			return searchRecord(root.left, rollNo);
		}else  {
			return searchRecord(root.right, rollNo);
		}
	
	}
	
	
	//Delete/Remove Student
	public void delete(int rollNo) {
		System.out.println("\nDelete operation performed");
		root = deleteRecord(root, rollNo);
	}
	
	
	private StudentNode deleteRecord(StudentNode root, int rollNo) {
		if(root == null) {
			return root;
		}
		if(rollNo < root.rollNo) {
			root.left = deleteRecord(root.left, rollNo);
		}else if(rollNo > root.rollNo) {
			root.right = deleteRecord(root.right , rollNo);
		}else {
			
			// case 1 : one or no child
			if(root.left == null) return root.right;
			if(root.right == null) return root.left;
			
			// case 2: in case of two children
			
			StudentNode sucessor = findMin(root.right);
			root.rollNo = sucessor.rollNo;
			root.name = sucessor.name;
			root.right = deleteRecord(root.right, sucessor.rollNo);
			}
		return root;
		}
	
	private StudentNode findMin(StudentNode node) {
		while (node.left!= null) {
			node = node.left;
		}	
		return node;
	}
	
	public void displayInOrder() {
		System.out.println("\nSorted record");
		displayRecord(root);
	}
	private void displayRecord(StudentNode root) {
		if(root!=null) {
			displayRecord(root.left);
			System.out.println("Roll No: " + root.rollNo + " Name: " + root.name );
			displayRecord(root.right);
			
		}
	}
	
	
}
