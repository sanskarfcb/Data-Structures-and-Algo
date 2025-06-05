package Tree;

public class WidthOfBinaryTree {
            if (root == null) return 0;

            int maxWidth = 0;
            Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
            q.offer(new Pair<>(root, 0));

            while (!q.isEmpty()) {
                int size = q.size();
                int minIndex = q.peek().getValue(); // to normalize index
                int first = 0, last = 0;

                for (int i = 0; i < size; i++) {
                    Pair<TreeNode, Integer> curr = q.poll();
                    TreeNode node = curr.getKey();
                    int idx = curr.getValue() - minIndex;

                    if (i == 0) first = idx;
                    if (i == size - 1) last = idx;

                    if (node.left != null)
                        q.offer(new Pair<>(node.left, 2 * idx));
                    if (node.right != null)
                        q.offer(new Pair<>(node.right, 2 * idx + 1));
                }

                maxWidth = Math.max(maxWidth, last - first + 1);
            }

            return maxWidth;
        }
