class Solution {
    public int median(int[][] mat) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list,(a,b)->a-b);
        
        int i=0;
        int j=list.size();
        
        int idx=(i+j)/2;
        
        
        return list.get(idx);
    }
}