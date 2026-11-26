
class Solution {
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode solve(int[] preorder, int[] inorder, int left, int right) {

        // No elements left
        if (left > right) return null;

        // First element of preorder is always root
        int rootVal = preorder[preIndex];
        preIndex++;

        TreeNode root = new TreeNode(rootVal);

        // Find root in inorder
        int index = left;
        while (index <= right && inorder[index] != rootVal) {
            index++;
        }

        // Build left subtree
        root.left = solve(preorder, inorder, left, index - 1);

        // Build right subtree
        root.right = solve(preorder, inorder, index + 1, right);

        return root;
    }
}
