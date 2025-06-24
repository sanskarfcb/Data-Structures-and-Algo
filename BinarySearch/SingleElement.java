package BinarySearch;

public class SingleElement {

        public int singleNonDuplicate(int[] nums) {
            int low =0;
            int n = nums.length;
            int high = n-1;
            int mid = 0;

            if(n==1){
                return nums[0];
            }
            if(nums[0] != nums[1]){
                return nums[0];
            }
            if(nums[n-1] != nums[n-2]){
                return nums[n-1];
            }
            while(low<=high){
                mid = (low+high)/2;
                if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                    return nums[mid];
                }
                if((mid%2==1 && nums[mid]!=nums[mid-1]) || (mid%2==0 && nums[mid] != nums[mid+1] )){
                    high = mid-1;
                }else{
                    low = mid+1;
                }

            }
            return -1;
        }
    }

