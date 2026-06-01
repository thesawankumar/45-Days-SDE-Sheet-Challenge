class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        //check first decreaing elem from right
        int i=n-2;
        while(i>=0 && nums[i] >=nums[i+1])
        {
            i--;
        }
        //if a breakpoint exists then find next greater element
        if(i>=0)
        {
            int j=n-1;

            while(j>= 0 && nums[j] <=nums[i])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private void swap(int [] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    private void reverse(int[] nums,int left,int right)
    {
        while(left <right)
        {
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}