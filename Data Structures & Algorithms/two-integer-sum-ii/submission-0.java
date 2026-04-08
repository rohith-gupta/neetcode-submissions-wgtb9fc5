class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            int diff = target-numbers[i];
            System.out.println(diff);
            if(!map.containsKey(diff))
                map.put(numbers[i],i);
            else 
            {
                return new int[]{map.get(diff)+1, i+1};
            }
        }
        return new int[]{};
        
    }
}
