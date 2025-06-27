package String;

public class ReverseString {

        public String reverseWords(String s) {
            int n = s.length();
            StringBuilder str = new StringBuilder();
            String [] words = s.trim().split("\\s+");

            for(int i = words.length-1;i >= 0; i--){
                str.append(words[i]);
                if(i!=0){
                    str.append(" ");
                }
            }
            return str.toString();

        }
    }

