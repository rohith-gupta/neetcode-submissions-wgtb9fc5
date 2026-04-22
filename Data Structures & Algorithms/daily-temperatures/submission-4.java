class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int [] result = new int[temp.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=temp.length-1;i>=0;i--)
        {
            while(!stack.isEmpty())
            {
                if(temp[i] >= temp[stack.peek()])
                {
                    stack.pop();
                }
                else {
                    result[i] = stack.peek() - i;
                    // stack.push(i);
                    break;
                }
            }
            stack.push(i);
        }
        return result;
    }
}
