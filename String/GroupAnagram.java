package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> hs = new HashMap<>();

            for(String word : strs){
                char[] ch = word.toCharArray();
                Arrays.sort(ch);
                String s = new String(ch);

                hs.computeIfAbsent(s,k->new ArrayList<>()).add(word);
            }
            return new ArrayList<>(hs.values());
        }
    }

