class Solution {
    public String minWindow(String s, String t) {
        int [] mapS = new int[256]; 
        int [] mapT = new int[256];
        if(t.length() > s.length())
            return "";
        if(t.length() == 0 || s.length() == 0)
            return "";
        for(int i=0;i<t.length();i++)
        {
            mapT[t.charAt(i)]++;
        }
        int originalCount=0;
        for(int i=0;i<mapT.length;i++)
        {
            if(mapT[i] > 0)
            {
                originalCount++;
            }
        }
        System.out.println(originalCount);

        int left=0;
        int hasCount=0;
        int leftIndex=0;
        int rightIndex=0;
        int total = Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++)
        {
            mapS[s.charAt(right)]++;
            if(mapS[s.charAt(right)] == mapT[s.charAt(right)])
            {
                hasCount++;
            }
            while(hasCount == originalCount)
            {
                if(total > (right-left+1))
                {
                    total = right-left+1;
                    leftIndex= left;
                    rightIndex=right;
                }
                mapS[s.charAt(left)]--;
                if(mapS[s.charAt(left)] < mapT[s.charAt(left)])
                {
                    hasCount--;
                }
                left++;
            }
            
        }
        if (total == Integer.MAX_VALUE)
            return "";

        return s.substring(leftIndex,rightIndex+1);
    }
}
