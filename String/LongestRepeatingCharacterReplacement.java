package String;

public class LongestRepeatingCharacterReplacement {
        public int characterReplacement(String s, int k) {

            int arr[] = new int[26];
            int left=0;
            int len=0;
            int max=0;
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'A']++;
                max = Math.max(max,arr[s.charAt(i)-'A']);

                if((i-left+1)-max>k){
                    arr[s.charAt(left)-'A']--;
                    left++;
                }
                len = Math.max(len,i-left+1);
            }
            return len;
        }
    }

