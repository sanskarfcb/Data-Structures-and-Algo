package Tree;

import javax.swing.tree.TreeNode;

public class MaxPathSum {

        int max = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            maxpath(root);
            return max;
        }
        public int maxpath(TreeNode root){
            if(root==null){
                return 0;
            }
            int l = Math.max(maxpath(root.left),0);
            int r = Math.max(maxpath(root.right),0);
            max = Math.max(max,root.val+l+r);
            return root.val + Math.max(l,r);
        }
    }

