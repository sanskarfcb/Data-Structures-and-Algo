package BinarySearch;

public class Search_Insert_point {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;

        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]>target){
                high = mid -1;
            }
            if(nums[mid]<target){
                low = mid+1;
            }

        }
        return low;
    }
}
