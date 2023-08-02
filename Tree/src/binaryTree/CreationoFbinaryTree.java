package binaryTree;

public class CreationoFbinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		BinaryTree btree=new BinaryTree();
		Node root=btree.CreateAbinaryTree();
		btree.Inorder(root);
	}

}
