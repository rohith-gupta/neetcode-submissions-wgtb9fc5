class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            if(!map.containsKey(num))
                map.put(num,0);
            
            map.put(num,map.get(num)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(((a,b) -> Integer.compare(b.getValue(),a.getValue())));
        int a[] = new int[k];
        for(int i=0;i<k;i++)
        {
            a[i] = list.get(i).getKey();
        }
        return a;
    }
}
