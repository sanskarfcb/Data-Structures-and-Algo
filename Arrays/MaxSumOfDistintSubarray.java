package Arrays;

public class MaxSumOfDistintSubarray {
        public long maximumSubarraySum(int[] nums, int k) {
            Set<Integer> hs = new HashSet<>();
            int l=0;
            long max=0;
            long sum=0;

            for(int i=0;i<nums.length;i++){
                while(hs.contains(nums[i]) || i-l>=k){
                    hs.remove(nums[l]);
                    sum =sum - nums[l];
                    l++;
                }
                hs.add(nums[i]);
                sum+=nums[i];

                if(i-l+1==k){
                    max=Math.max(max,sum);
                }
            }
            return max;
        }
    }

