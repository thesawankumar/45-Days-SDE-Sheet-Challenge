class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        solve(ans,new ArrayList<>(),s,0);
        return ans;
    }
    private void solve(List<List<String>> ans,ArrayList<String> list,String s,int start)
    {
        if(start==s.length())
        {
            ans.add(new ArrayList<>(list));
        }
        else
        {
            for(int i=start;i<s.length();i++)
            {
                if(isPalindrome(s,start,i))
                {
                    list.add(s.substring(start,i+1));
                    solve(ans,list,s,i+1);
                    list.remove(list.size()-1);
                }
            }
        }

    }
    private boolean isPalindrome(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start++) !=s.charAt(end--))
            {
                return false;
            }
            
        }
        return true;
    }
}