class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n =arr.length;
        
        if(k>n) return -1;
        
        int low=0,high=0;
        
        for(int x:arr)
        {
            low=Math.max(low,x);
            high +=x;
        }
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            if(countStudents(arr,mid)<=k)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    private int countStudents(int[]arr,int pages)
    {
        int students=1,sum=0;
        
        for(int x:arr)
        {
            if(sum+x<=pages)
            {
                sum +=x;
            }else
            {
                students++;
                sum =x;
            }
        }
        return students;
    }
}