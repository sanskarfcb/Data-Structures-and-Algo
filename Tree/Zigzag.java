package Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zigzag {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if(root==null){
                return res;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            boolean isright=true;
            while(!q.isEmpty()){
                List<Integer> qs = new LinkedList<>();
                int size = q.size();
                for(int i =0;i<size;i++){
                    TreeNode n = q.poll();
                    if(isright){
                        qs.addLast(n.val);
                    }
                    else{
                        qs.addFirst(n.val);
                    }
                    if(n.left!=null){
                        q.add(n.left);
                    }
                    if(n.right!=null){
                        q.add(n.right);
                    }
                }
                res.add(qs);
                isright = !isright;

            }
            return res;
        }
}
