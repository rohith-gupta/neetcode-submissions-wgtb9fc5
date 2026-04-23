class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<int[]> stack = new Stack<>();
        int temp[] = position.clone();
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++)
        {
            for(int j=0;j<position.length;j++)
            {
                if(temp[i] == position[j])
                {
                    stack.push(new int[]{position[j],speed[j]});
                    // System.out.println(stack.peek()[0]+" "+stack.peek()[1]);
                }
            }
        }
        int fleet = 0;
        int num = 1;
        
        while(!stack.isEmpty())
        {
            while(!stack.isEmpty() && (stack.peek()[0] + (num * stack.peek()[1])) < target)
            {
                num++;
            }
            // System.out.println(num);
            while(!stack.isEmpty() && (stack.peek()[0] + (num * stack.peek()[1])) >= target)
            {
                int a[] = stack.pop();
                // System.out.println(a[0]+" - "+a[1]);
            }
            fleet++;
            num=1;
            // System.out.println(fleet);
        }
        return fleet;

    }
}
 