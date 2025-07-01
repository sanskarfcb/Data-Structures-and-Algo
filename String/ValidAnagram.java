package String;

public class ValidAnagram {
        public boolean isAnagram(String s, String t) {
            int ch = 256;
            int arr [] = new int [ch];
            if(s.length()!=t.length()){
                return false;
            }

            for(int i =0;i<s.length();i++){
                arr[s.charAt(i)]++;
                arr[t.charAt(i)]--;
            }
            for(int i=0;i<ch;i++){
                if(arr[i]!=0){
                    return false;
                }
            }
            return true;
        }
    }

