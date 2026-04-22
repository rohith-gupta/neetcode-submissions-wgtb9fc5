class Solution {
    public int evalRPN(String[] tokens) {
        int result =Integer.parseInt(tokens[0]);
        int num=0;
        for(int i=1;i<tokens.length;i++)
        {
            if(tokens[i].equals("+"))
            {
                result += num;
            }
            else if(tokens[i].equals("*"))
            {
                result *= num;
            }
            else if(tokens[i].equals("-"))
            {
                result -= num;
            }
            else if(tokens[i].equals("/"))
            {
                result = (int)result/num;
            }
            else 
            {
                num = Integer.parseInt(tokens[i]);
            }

        }
        return result;
    }
}
