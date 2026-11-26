
class Solution {
    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        return solve(inorder, postorder, 0, inorder.length - 1);
    }

    public TreeNode solve(int[] inorder, int[] postorder, int left, int right) {

        // Base case
        if (left > right) return null;

        // Last element of postorder is root
        int rootVal = postorder[postIndex];
        postIndex--;

        TreeNode root = new TreeNode(rootVal);

        // Find root in inorder
        int index = left;

        while (index <= right && inorder[index] != rootVal) {
            index++;
        }

        // First build right subtree
        root.right = solve(inorder, postorder, index + 1, right);

        // Then build left subtree
        root.left = solve(inorder, postorder, left, index - 1);

        return root;
    }
}
