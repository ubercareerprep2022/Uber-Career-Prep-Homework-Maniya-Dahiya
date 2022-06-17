public class Exercise4 {
    private TreeNode root;

    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;
    
        public TreeNode(int data, TreeNode left, TreeNode right) {
          this.data = data;
          this.left = left;
          this.right = right;
        }
      }


    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data, root.left, root.right);
        } else {
            addHelper(data, root);
        }
    }

    /**
     * Helper method for add(T data)
     * @param data data to add
     * @param node tree's root
     */
    private void addHelper(int data, TreeNode node) {
        if (data > node.data) {
            if (node.right == null) {
                node.right = new TreeNode(data, node.left, node.right);
            } else {
                addHelper(data, node.right);
            }
        } else if (data < node.data) {
            if (node.left == null) {
                node.left = new TreeNode(data, node.left, node.right);
            } else {
                addHelper(data, node.left);
            }
        }
    }




    public boolean find(int data) {
        if (root.data == data) {
            return true;
        }
        int[] arr = new int[1];
        arr[0] = -1;
        TreeNode node = new TreeNode(root.data, root.left, root.right);
        containHelper(data, root, arr);
        if (arr[0] == 10) {
            return true;
        }
        return false;
    }

    /**
     * Helper method for contains()
     * @param data to search for
     * @param node current node
     * @param arr that stores if the data is present
     * @return data if data is in the tree
     */
    private int containHelper(int data, TreeNode node, int[] arr) {
        if (node == null) {
            return -1;
        }
        if (data == node.data) {
            arr[0] = 10;
            return node.data;
        } else if (data < (node.data)) {
            return containHelper(data, node.left, arr);
        } else if (data > (node.data)) {
            return containHelper(data, node.right, arr);
        }
        return -1;
    }
    
}
