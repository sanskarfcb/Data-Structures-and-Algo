package Arrays;

public class MaxAvgSubarray {
        public double findMaxAverage(int[] nums, int k) {
            double a = 0;
            int sum=0;
            double max=0;
            for(int i=0;i<k;i++){
                sum+=nums[i];
            }
            a = (double)sum/k;
            max = a;
            //int j=0;
            for(int i = k;i<nums.length;i++){
                sum = sum-nums[i-k]+nums[i];
                //  j++;
                a=(double)sum/k;
                max=Math.max(max,a);
            }
            return max;

        }
    }

