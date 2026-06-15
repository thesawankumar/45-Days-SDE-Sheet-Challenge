class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        
        int n=deadline.length,maxD=0;
        
        int[][]jobs=new int[n][2];
        
        for(int i=0;i<n;i++)
        {
            jobs[i][0]=deadline[i];
            jobs[i][1]=profit[i];
            maxD=Math.max(maxD,deadline[i]);
        }
        Arrays.sort(jobs,(a,b)->b[1]-a[1]);
        
        boolean []sort=new boolean[maxD+1];
        int cnt=0,prof=0;
        
        for(int []job :jobs)
        {
            for(int j=job[0];j>0;j--)
            {
                if(!sort[j])
                {
                    sort[j]=true;
                    cnt++;
                    prof += job[1];
                    break;
                }
            }
        }
        return new ArrayList<>(Arrays.asList(cnt,prof));
        
    }
}