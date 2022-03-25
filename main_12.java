package Fridayevening;
class Node
{
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class BinaryTree
{
    //Root of the Binary Tree
    Node root;
 
   public int maxDepth(Node root) {
    if(root==null)
        return 0;
    int left_Depth = maxDepth(root.left);
    int right_Depth = maxDepth(root.right);
    int bigger = Math.max(left_Depth, right_Depth);
    return bigger+1;
}
     /* Driver program to test above functions */
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(55);
        tree.root.left = new Node(21);
        tree.root.right = new Node(80);
        tree.root.left.left = new Node(9);
        tree.root.left.right = new Node(29);
        tree.root.right.left = new Node(76);
        tree.root.right.right = new Node(91);
        System.out.println("The Maximum depth of the binary tree is: " + tree.maxDepth(tree.root));
    }
}

