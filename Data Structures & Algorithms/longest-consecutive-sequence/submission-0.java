class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int longest=1;
        int temp=1;
        int start=Integer.MIN_VALUE;
        for(int num : set)
        {
            if(start +1 == num)
            {
                temp++;
            }
            else 
            {
                if(temp > longest)
                {
                    longest=temp;
                    temp=1;
                }
                else 
                {
                    temp=1;
                }
            }
            start=num;
        }
        if(temp > longest)
            longest = temp;
        return longest;
    }
}
