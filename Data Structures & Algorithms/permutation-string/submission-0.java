class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int a[] = new int[26];
        int b[] = new int[26];
        for(int i=0;i<s1.length();i++)
            a[s1.charAt(i) - 'a']++;
        for(int i=0; i<s2.length();i++)
        {
            
            b[s2.charAt(i) - 'a']++;
            if(a[s2.charAt(i)-'a'] != b[s2.charAt(i)-'a'])
                b[s2.charAt(i) - 'a'] = 0;
            System.out.println(i);
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i] != b[i])
                return false;
        }

        return true;
    }
}
