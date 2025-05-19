package Tree;

import javax.swing.tree.TreeNode;

public class Diameter_of_binary_tree {
        int d = 0;
        public int diameterOfBinaryTree(TreeNode root) {
            dfs(root);
            return d;
        }
        public int dfs(TreeNode node){
            if(node == null){
                return 0;
            }
            int l = dfs(node.left);
            int r = dfs(node.right);
            d = Math.max(d,l+r);
            return 1 + Math.max(l,r);
        }
    }

