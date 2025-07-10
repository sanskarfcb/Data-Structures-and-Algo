package Arrays;

public class TopKfrequent {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            PriorityQueue<Map.Entry<Integer, Integer>> pq =
                    new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pq.offer(entry);
                if (pq.size() > k) {
                    pq.poll();
                }
            }

            int[] res = new int[k];
            int i = 0;
            for (Map.Entry<Integer, Integer> entry : pq) {
                res[i++] = entry.getKey();
            }

            return res;
        }
    }

