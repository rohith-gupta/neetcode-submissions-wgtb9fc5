class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            int freq[] = new int[26];
            for(char c : s.toCharArray())
            {
                freq[c-'a']++;
            }
            StringBuffer sb = new StringBuffer();
            for(int num : freq)
            {
                sb.append(num);
                sb.append("#");
            }

            System.out.println(map.containsKey(sb.toString()));
            String key = sb.toString();
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        // List<List<String>> list = new ArrayList<>();
        // map.forEach((k, v) -> {
        //     list.add(v);
        // });
        return new ArrayList<>(map.values());
    }
}
