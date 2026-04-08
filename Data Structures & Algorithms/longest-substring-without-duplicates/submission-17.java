class Solution {
    public int lengthOfLongestSubstring(String s) {

        int start=0;
        int end =0;
        int maxCount=0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
            }
            else 
            {
                end = i;
                maxCount = Math.max(maxCount,end-start);
                for(int j=0;j<=i;j++)
                {
                    if(set.contains(s.charAt(i)))
                    {
                        set.remove(s.charAt(j));
                    }
                    else 
                    {
                        start=j;
                        break;
                    }
                }

            }
        }

        return maxCount;
        
    }
}
