public class Exercise2 {
    public List<T> levelorder() {
        Queue<TreeNode> queue = new LinkedList<>();
        List<T> data = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (tmp != null) {
                data.add(tmp.getData());
                queue.add(tmp.getLeft());
                queue.add(tmp.getRight());
            }
        }
        return data;

    }
}
