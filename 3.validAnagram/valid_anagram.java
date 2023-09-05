import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            
            countS.put(chS, countS.getOrDefault(chS, 0) + 1);
            countT.put(chT, countT.getOrDefault(chT, 0) + 1);
        }
        
        for (char c : countS.keySet()) {
            if (!countS.get(c).equals(countT.getOrDefault(c, 0))) {
                return false;
            }
        }
        
        return true;
    }
}