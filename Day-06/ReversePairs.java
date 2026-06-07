class Solution {
    public int reversePairs(int[] nums) {
        //merge sort

        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((long) nums[i] > 2L*nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}