public class Exercise3 {
    public int numLevel() {
        if (root == null) {
            return -1;
        } else {
            return heightHelper(root);
        }
    }

    /**
     * Helper method for height()
     * @param node the starter node to find the height from
     * @return height of a node
     */
    private int heightHelper(TreeNode node) {
        if (node == null) {
            return -1;
        } else {
            int lHeight = 1 + heightHelper(node.getLeft());
            int rHeight = 1 + heightHelper(node.getRight());
            if (lHeight > rHeight) {
                return (lHeight);
            } else {
                return (rHeight);
            }
        }
    }

}
