class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[] = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            int temp=0;
            for(int j=i;j<temperatures.length;j++)
            {
                if(temperatures[i] < temperatures[j])
                {
                    temp = j-i;
                    break;
                }
            }
            result[i] = temp;
            temp=0;
        }
        return result;
    }
}
