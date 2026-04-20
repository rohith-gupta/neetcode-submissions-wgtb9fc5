class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] list = new int[nums.length-2];
        int [] size = new int[k];
        for(int i=0;i<k;i++)
        {
            size[i] = nums[i];
        }
        int index=0;
        list[index] = max(size);
        index++;
        int left=1;
        for(int right = k; right < nums.length;right++)
        {
            int j=0;
            for(int i=left;i<=right;i++)
            {
                size[j] = nums[i];
                j++;
            }
            System. out.println("left = " + left +" " + "right = "+ right+ " --" +size[0]+" "+ size[1]+" "+ size[2]);
            list[index] = max(size);
            index++;
            left++;

        }

        return list;
    }

    public int max(int a[])
    {
        int top=0;
        for(int i=0;i<a.length;i++)
        {
            if(top < a[i])
                top = a[i];
        }
        System.out.println(top);
        return top;
    }
}
