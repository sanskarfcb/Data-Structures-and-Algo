package Arrays;

public class q3Sum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ls = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int start = i + 1;
                int end = nums.length - 1;

                while (start < end) {
                    int sum = nums[i] + nums[start] + nums[end];

                    if (sum == 0) {
                        ls.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        start++;
                        end--;

                        while (start < end && nums[start] == nums[start-1])                   start++;
                        while (start < end && nums[end] == nums[end + 1]) end--;
                    }
                    else if (sum < 0) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
            return ls;
        }
    }

