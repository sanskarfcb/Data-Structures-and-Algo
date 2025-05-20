package Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> ls = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    TreeNode current = q.poll();
                    ls.add(current.val);

                    if (current.left != null) q.add(current.left);
                    if (current.right != null) q.add(current.right);
                }

                ans.add(ls);
            }

            return ans;
        }
    }


