package String;

public class FancyString {

        public String makeFancyString(String s) {
            StringBuilder str = new StringBuilder();
            char c = s.charAt(0);
            str.append(c);
            int count=1;
            for(int i =1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    count++;
                }else{
                    count=1;
                }
                if(count<3){
                    str.append(s.charAt(i));
                }
            }
            return str.toString();
        }
    }

