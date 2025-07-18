package Arrays;

public class ProductOfArrayExceptSelf {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int [] ans = new int[n];

            ans[0] = 1;
            for(int i=1;i<nums.length;i++){
                ans[i] = ans[i-1]*nums[i-1];
            }

            int suf = 1;
            for(int i = n-1; i >= 0 ; i--){
                ans[i] = ans[i]*suf;
                suf =suf*nums[i];
            }
            return ans;
        }
    }

