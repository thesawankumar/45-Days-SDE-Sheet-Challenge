class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length;
        int m=b.length;
        
        int[] temp=new int[n+m];
        
        int index=0;
        
        for(int i=0;i<n;i++)
        {
            temp[index++]=a[i];
        }
        for(int i=0;i<m;i++)
        {
            temp[index++]=b[i];
        }
        Arrays.sort(temp);
        
        return temp[k-1];
    }
}