class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        
        Arrays.sort(stalls);
        
        int l=1,r=stalls[stalls.length-1]-stalls[0];
        
        int ans=0;
        
        while(l<=r)
        {
            int mid =l+(r-l)/2;
            
            if(canPlace(stalls,k,mid))
            {
                ans=mid;
                l=mid+1;
                
            }else
            {
                r=mid-1;
            }
        }
        return ans;
        
    }
    private boolean canPlace(int[]stalls,int k,int dist)
    {
        int cows=1,last=stalls[0];
        
        
        for(int i=1;i<stalls.length;i++)
        {
            if(stalls[i]-last>=dist)
            {
                cows++;
                last=stalls[i];
            }
        }
        return cows>=k;
    }
}