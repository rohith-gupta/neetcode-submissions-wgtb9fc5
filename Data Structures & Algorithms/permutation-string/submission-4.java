class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int a[] = new int[26];
        int b[] = new int[26];
        int match =0;
        for(int i=0;i<s1.length();i++)
        {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }
        
        int left=0;
        System.out.println(match);
        for(int right=s1.length(); right<s2.length();right++)
        {
            if(a[s2.charAt(left)-'a'] == b[s2.charAt(left)-'a'])
                match--;
            b[s2.charAt(left)-'a']--;
            left++;
            b[s2.charAt(right)-'a']++;
            if(a[s2.charAt(right)-'a'] == b[s2.charAt(right)-'a'])
                match++;
            if(match == s1.length())
                return true;
        }
        return false;
    }
}
