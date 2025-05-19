package Tree;


import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            preorder(root,result);
            return result;
        }
        public void preorder(TreeNode node , List<Integer> result){
            if(node==null){
                return;
            }
            result.add(node.val);
            preorder(node.left,result);
            preorder(node.right,result);

        }
    }

