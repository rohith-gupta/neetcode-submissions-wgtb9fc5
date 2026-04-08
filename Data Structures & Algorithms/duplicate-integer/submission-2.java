class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i : nums)
        {
            if(set.add(i))
                continue;
            else
                return true;
        }
        return false;
    }
}