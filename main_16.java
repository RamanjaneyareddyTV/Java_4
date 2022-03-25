package Fridayevening;

class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
 
class BinaryTree
{
    // Root of Binary Tree
    Node root;
 
    BinaryTree()
    {
        root = null;
    } 
  
    // Print the nodes of binary tree in inorder
    void print_Inorder(Node node)
    {
        if (node == null)
            return;
 
        print_Inorder(node.left);
 
     // Print the data of node
        System.out.print(node.key + " ");
 
        print_Inorder(node.right);
    }
 
	void print_Inorder()
	   {     
	     print_Inorder(root);   
	     
	   }
    
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(55);
        tree.root.left = new Node(21);
        tree.root.right = new Node(80);
        tree.root.left.left = new Node(9);
        tree.root.left.right = new Node(29);
        tree.root.right.left = new Node(76);
        tree.root.right.right = new Node(91);
 
        System.out.println("\nInorder traversal of binary tree is: ");
        tree.print_Inorder(); 
    }
}

