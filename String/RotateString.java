package String;

public class RotateString {
        public boolean rotateString(String s, String goal) {
            if(s.length()!=goal.length()){
                return false;
            }
            s = s+s;

            return s.contains(goal);
        }
    }

