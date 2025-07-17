package String;

public class PermutationInString {
        public boolean checkInclusion(String s1, String s2) {
            int n = s1.length();
            int m = s2.length();
            int [] s1arr = new int[26];
            int [] s2arr = new int[26];
            if (s1.length() > s2.length()) return false;

            for(int i=0;i<n;i++){
                s1arr[s1.charAt(i)-'a']++;
                s2arr[s2.charAt(i)-'a']++;
            }
            for(int i =n;i<m;i++){
                if(matches(s1arr,s2arr)){
                    return true;
                }
                s2arr[s2.charAt(i)-'a']++;
                s2arr[s2.charAt(i-n)-'a']--;
            }
            return matches(s1arr,s2arr);
        }
        public boolean matches( int[] s1,int []s2){
            for(int i=0;i<26;i++){
                if(s1[i]!=s2[i]){
                    return false;
                }
            }
            return true;
        }
    }

