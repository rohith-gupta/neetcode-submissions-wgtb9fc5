class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        int result =0;
        for(int num : set)
        {
            if(!set.contains(num-1))
            {
                int current = num;
                int longest = 0;

                while(set.contains(current++))
                {
                    longest++;
                }
                result = Math.max(result,longest);
            }
        }
        return result;
        
    }
}
