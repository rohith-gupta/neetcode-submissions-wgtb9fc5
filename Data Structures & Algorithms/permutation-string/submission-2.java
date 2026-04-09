class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int a[] = new int[26];
        int b[] = new int[26];
        for(int i=0;i<s1.length();i++)
            a[s1.charAt(i) - 'a']++;
        int match=0;
        for(int i=0; i<s2.length();i++)
        {
            
            b[s2.charAt(i) - 'a']++;
            
            System.out.println(b[s2.charAt(i) - 'a']+" "+a[s2.charAt(i) - 'a']);
            if(a[s2.charAt(i)-'a'] != b[s2.charAt(i)-'a'] && match != s1.length())
            {
                b = new int[26];
                match=0;
            }
            else
            {
                if(b[s2.charAt(i) - 'a'] != b[s2.charAt(i) - 'a'])
                    match++;
            }
            if(match == s1.length())
                break;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(b[i]+" "+a[i]);
            if(a[i] != b[i])
                return false;
        }

        return true;
    }
}
