class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums2.length;i++)
        {
            mp.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            int index=mp.get(nums1[i]);

            int greater=-1;

            while(index <nums2.length)
            {
                if(nums2[index] > nums1[i])
                {
                    greater=nums2[index];
                    break;
                }
                index++;
            }
            result[i]=greater;
        }
        return result;
    }
}