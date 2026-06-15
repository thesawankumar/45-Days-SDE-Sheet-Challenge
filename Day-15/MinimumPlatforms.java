class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        //sort 
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=0,j=0,curr=0,max=0;
        
        while(i<arr.length && j< arr.length)
        {
            if(arr[i]<=dep[j])
            {
                curr++;
                
                max=Math.max(max,curr);
                i++;
                
            }else
            {
                curr--;
                j++;
            }
        }
        return max;
    }
}
