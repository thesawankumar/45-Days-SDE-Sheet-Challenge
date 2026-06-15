class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n=val.length;
        double[][] items=new double[n][2];
        
        for(int i=0;i<n;i++)
        {
            items[i][0]=(double) val[i]/wt[i];
            items[i][1]=i;
        }
        
        Arrays.sort(items,(a,b)->Double.compare(b[0],a[0]));
        
        
        double ans=0;
        
        for(double[]item:items)
        {
            int i=(int) item[1];
            
            if(wt[i] <=capacity)
            {
                ans +=val[i];
                capacity -=wt[i];
            }else
            {
                ans +=item[0] * capacity;
                break;
            }
        }
        return ans;
    }
}