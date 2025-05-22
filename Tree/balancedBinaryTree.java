package Tree;

import javax.swing.tree.TreeNode;

public class balancedBinaryTree {

        boolean result = true;
        public boolean isBalanced(TreeNode root) {
            balanced(root);
            return result;
        }
        public int balanced(TreeNode root){
            if(root == null){
                return 0;
            }
            int l = balanced(root.left);
            int r = balanced(root.right);
            int res = l-r;
            if(Math.abs(res)>1){
                result = false;
            }
            return 1 + Math.max(l,r);
        }
    }


