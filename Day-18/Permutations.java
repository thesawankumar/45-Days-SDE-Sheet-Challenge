class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        solve(ans,new ArrayList<>(),nums);

        return ans;
    }
    private void solve(List<List<Integer>> ans,ArrayList<Integer> list,int [] nums)
    {
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList<>(list));

        }else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(list.contains(nums[i]))
                {
                    continue;
                }
                list.add(nums[i]);
                solve(ans,list,nums);
                list.remove(list.size()-1);
            }
        }
    }
}