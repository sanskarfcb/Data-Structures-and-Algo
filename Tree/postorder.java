package Tree;

public class postorder {

        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            post(root,ans);
            return ans;
        }
        public void post(TreeNode node,List<Integer> ans){
            if(node==null){
                return;
            }
            post(node.left,ans);
            post(node.right,ans);
            ans.add(node.val);
        }
    }

