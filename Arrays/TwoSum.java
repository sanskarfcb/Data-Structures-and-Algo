package Arrays;

public class TwoSum {

        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hs = new HashMap<>();

            for(int i=0 ;i<nums.length;i++){
                int n = nums[i];
                int diff = target - n;

                if(hs.containsKey(diff)){
                    return new int[]{hs.get(diff),i};
                }
                hs.put(nums[i],i);
            }
            return new int[]{};
        }
    }

