package Arrays;

public class LongestConsecutiveSequence {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) return 0;
            Set<Integer> hs = new HashSet<>();
            for (int num : nums) {
                hs.add(num);
            }
            int longest = 0;
            for (int num : hs) {
                if (!hs.contains(num - 1)) {
                    int curr = num;
                    int count = 1;

                    while (hs.contains(curr + 1)) {
                        curr++;
                        count++;
                    }
                    longest = Math.max(longest, count);
                }
            }
            return longest;
        }
    }

