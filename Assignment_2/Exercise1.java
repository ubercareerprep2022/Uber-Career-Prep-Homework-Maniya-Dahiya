public class Exercise1 {
    public void preorder() {
        List<T> list = new ArrayList<>();
        preorderHelper(list, root);
        for (Tree i : list) {
            System.out.println(i);
        }

    }

    /**
     * Helper method for preorder()
     * @param list that stores data
     * @param node root node
     */
    private void preorderHelper(List<T> list, TreeNode node) {
        if (node == null) {
            return;
        } else {
            list.add(node.getData());
            preorderHelper(list, node.getLeft());
            preorderHelper(list, node.getRight());
        }
    }

    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(2, null, null);
        TreeNode rightChild = new TreeNode(1, null, null);
        TreeNode root = new TreeNode(1, leftChild, rightChild);
        Tree dummy = new Tree(root);
        tree.preorder(dummy.root);
      }

 
}
