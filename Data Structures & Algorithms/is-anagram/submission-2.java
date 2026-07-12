class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] letters = s.toCharArray();
        for(char c : letters){
            int index = t.indexOf(c);
            if(index >= 0) {
                t = t.substring(0, index) + t.substring(index + 1);
            } else return false;
        }
        return true;
    }
}