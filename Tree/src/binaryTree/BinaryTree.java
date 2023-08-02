package binaryTree;

import java.util.Scanner;

class BinaryTree
{
	Scanner sc;
 public BinaryTree()
 {
	 sc=new Scanner(System.in);
 }
	
	//create a binary tree returns the root node
  Node CreateAbinaryTree()
  {
	System.out.println("Enter the Node data");
	int data=sc.nextInt();
	if(data==-1)
	{
		return null;
	}
	Node node=new Node(data);
	System.out.println("Enter"+data+"left Node");
	node.left=CreateAbinaryTree();
	System.out.println("Enter"+data+"right Node");
	node.right=CreateAbinaryTree();
	
	return node;	  
  }
 public  void Inorder(Node root)
  {
	  if(root==null)
	  {
		 return ; 
	  }
	  Inorder(root.left);
	  System.out.println(root.data);
	  Inorder(root.right);
  }

}
class Node
{
	int data;
	Node left;
	Node right;
	 public Node(int data)
	 {
		this.data=data; 
	 }
}