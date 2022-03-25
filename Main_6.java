package ENDOFBASICS1;

public class Main_6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = sortedArrayToBST(arr);
        traverseTree(root);
    }

    public static TreeNode sortedArrayToBST(int[] arr) {
        if (arr.length == 0) return null;
        return creation(arr, 0, arr.length - 1);
    }

    private static TreeNode creation(int[] arr, int start, int end) {
        TreeNode node = new TreeNode(0);
        if (start == end - 1) {
            node = new TreeNode(arr[start]);
            node.right = new TreeNode(arr[end]);
        } else if (start == end) {
            return new TreeNode(arr[start]);
        } else {
            int mid = (start + end) / 2;
            node.val = arr[mid];
            node.left = creation(arr, start, mid - 1);
            node.right = creation(arr, mid + 1, end);
        }
        return node;
    }

    private static void traverseTree(TreeNode root) {
        if (root != null) {
            traverseTree(root.left);
            traverseTree(root.right);
            System.out.println(root.val);
        }
    }

}

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
