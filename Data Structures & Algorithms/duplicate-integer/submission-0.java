class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        boolean added = true;
        for(int i : nums)
        {
            added = set.add(i);
            if(added == false)
                return true;
        }
        return false;
    }
}