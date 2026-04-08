class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxcount=0;
        System.out.println(s.length());
        for(int i=0;i<s.length();i++)
        {
            HashSet<Character> set = new HashSet<>();
            int j=i;
            while(j < s.length() && !set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                j++;
            }
            maxcount = Math.max(maxcount,set.size());
        }
        return maxcount;
    }
}
