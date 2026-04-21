class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] result = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<k;i++)
        {
            if(dq.isEmpty())
            {
                dq.addFirst(i);
            }
            else 
            {
                if(nums[dq.peekFirst()] < nums[i])
                {
                    dq.pollFirst();
                    dq.addFirst(i);
                }
                else 
                {
                    dq.addLast(i);
                }
            }
        }
        int j=0;
        result[j]=nums[dq.peekFirst()];
        j++;
        int left=0;
        for(int right=k;right<nums.length;right++)
        {
            if(nums[left] == nums[dq.peekFirst()])
            {
                dq.removeFirst();
            }
            left++;
            if(dq.isEmpty())
            {
                dq.addFirst(right);
            }
            else 
            {
                if(nums[dq.peekFirst()] < nums[right])
                {
                    dq.pollFirst();
                    dq.addFirst(right);
                }
                else 
                {
                    dq.addLast(right);
                }
            }
            result[j]=nums[dq.peekFirst()];
            j++;
        }
        return result;
    }
}
