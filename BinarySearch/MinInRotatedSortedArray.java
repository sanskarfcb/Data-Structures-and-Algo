package BinarySearch;

public class MinInRotatedSortedArray {
        public int findMin(int[] nums) {
            int low = 0;
            int high = nums.length-1;
            int mid = 0;
            int ans = Integer.MAX_VALUE;

            while(low<=high){
                mid = (low+high)/2;

                if(nums[mid]>=nums[low]){
                    ans = Math.min(ans,nums[low]);
                    low= mid+1;
                }
                else{
                    ans = Math.min(ans,nums[mid]);
                    high = mid-1;
                }
            }
            return ans;
        }
    }

