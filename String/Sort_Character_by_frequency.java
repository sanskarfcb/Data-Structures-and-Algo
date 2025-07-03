package String;

public class Sort_Character_by_frequency {

        public String frequencySort(String s) {
            HashMap<Character,Integer> hs = new HashMap<>();

            for(int i =0;i<s.length();i++){
                hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
            }
            PriorityQueue<Character> maxheap = new PriorityQueue<>(
                    (a,b) -> hs.get(b) - hs.get(a)
            );
            maxheap.addAll(hs.keySet());

            StringBuilder sb = new StringBuilder();

            while(!maxheap.isEmpty()){
                char c = maxheap.poll();
                int f = hs.get(c);
                for(int i =0;i<f;i++){
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }

