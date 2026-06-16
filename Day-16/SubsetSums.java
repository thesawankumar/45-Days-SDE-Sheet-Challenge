// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        
        int subset=(int) Math.pow(2,arr.length);
        
        for(int i=0;i<subset;i++)
        {
            int sum=0;
            for(int j=0;j<arr.length;j++)
            {
                if((i&(1<<j)) !=0) sum +=arr[j];
                
            }
            ans.add(sum);
        }
        return ans;
    }
}