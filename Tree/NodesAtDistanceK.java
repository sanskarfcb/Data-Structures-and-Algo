package Tree;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class NodesAtDistanceK {
        Map<TreeNode, TreeNode> parent = new HashMap<>();

        public void parentchild(TreeNode root, TreeNode par) {
            if (root == null) return;
            parent.put(root, par);
            parentchild(root.left, root);
            parentchild(root.right, root);
        }

        public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            List<Integer> res = new ArrayList<>();
            parentchild(root, null);

            Queue<TreeNode> q = new LinkedList<>();
            Set<TreeNode> visited = new HashSet<>();
            q.add(target);
            visited.add(target);
            int distance = 0;

            while (!q.isEmpty()) {
                int size = q.size();
                if (distance == k) break;

                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();

                    if (node.left != null && !visited.contains(node.left)) {
                        q.add(node.left);
                        visited.add(node.left);
                    }

                    if (node.right != null && !visited.contains(node.right)) {
                        q.add(node.right);
                        visited.add(node.right);
                    }

                    TreeNode par = parent.get(node);
                    if (par != null && !visited.contains(par)) {
                        q.add(par);
                        visited.add(par);
                    }
                }
                distance++;
            }

            while (!q.isEmpty()) {
                res.add(q.poll().val);
            }

            return res;
        }

}
