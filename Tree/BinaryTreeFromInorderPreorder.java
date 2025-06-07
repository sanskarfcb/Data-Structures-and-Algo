package Tree;

public class BinaryTreeFromInorderPreorder {

        int index = 0;
        HashMap<Integer , Integer> hs = new HashMap<>();
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for(int i =0;i<inorder.length;i++){
                hs.put(inorder[i],i);
            }
            return recur(preorder,0,inorder.length-1);
        }
        public TreeNode recur(int preorder[],int start,int end){
            if(start>end){
                return null;
            }
            int rootValue = preorder[index++];
            TreeNode root = new TreeNode(rootValue);
            int Inindex = hs.get(rootValue);
            root.left = recur(preorder , start , Inindex-1 );
            root.right = recur(preorder , Inindex + 1 , end);
            return root;
        }
    }

