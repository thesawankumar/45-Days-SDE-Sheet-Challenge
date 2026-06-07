import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0)
        {
            return 0;
        }
        Set<Integer> numSet=new HashSet<>();
        for(int num:nums)
        {
            numSet.add(num);
        }
        int longSub=0;
        for(int num:numSet)
        {
            if(!numSet.contains(num-1))
            {
                int currNum=num;
                int currSub=1;

                while(numSet.contains(currNum+1))
                {
                    currNum++;
                    currSub++;
                }
                longSub=Math.max(longSub,currSub);
            }
        }
        return longSub;
    }
}