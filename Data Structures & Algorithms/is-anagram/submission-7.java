class Solution {
    public boolean isAnagram(String s, String t) {
        int total [] = new int[26];
        if(s.length() != t.length())
            return false;
        for(int i =0; i<s.length();i++)
        {
            total[s.charAt(i) - 'a']++;
            total[t.charAt(i) - 'a']--;
        }

        for(int value : total) 
        {
            if(value != 0)
                return false;
        }
        return true;
    }
}
