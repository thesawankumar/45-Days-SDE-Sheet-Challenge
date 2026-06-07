import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int val1=nums[0];
        int c1=1;
        int val2=nums[0];
        int c2=0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==val1)
            {
                c1++;
            }else if(nums[i]==val2)
            {
                c2++;
            }
            else if(c1==0)
            {
                val1=nums[i];
                c1=1;
            }
            else if(c2==0)
            {
                val2=nums[i];
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        int count1=0;
        int count2=0;

        for(int val:nums)
        {
            if(val==val1)
            {
                count1++;
            }
            else if(val==val2)
            {
                count2++;
            }
        }
        List<Integer> ans=new ArrayList<>();

        if(count1>nums.length/3)
        {
            ans.add(val1);
        }
        if(count2>nums.length/3)
        {
            ans.add(val2);
        }
        return ans;
    }
}