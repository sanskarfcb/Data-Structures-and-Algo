package String;

public class LongestSubstringWithoutRepeatingChar {

        public int lengthOfLongestSubstring(String s) {
            int l = 0;
            int r=0;
            int len = 0;
            Set<Character> hs = new HashSet<>();

            while(r<s.length()){
                if(!hs.contains(s.charAt(r))){
                    hs.add(s.charAt(r));
                    len = Math.max(len,r-l+1);
                    r++;
                }else{
                    hs.remove(s.charAt(l));
                    l++;
                }
            }
            return len;
        }
    }


