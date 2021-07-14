class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
        int index=0;
        int i=0;
        int j=0;
        while(i<n && j<m)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[index++]=nums1[i++];
            }
            else if(nums2[j]<nums1[i])
            {
                arr[index++]=nums2[j++];
            }
        }
        while(i<n)
        {
            arr[index++]=nums1[i++];
        }
        while(j<m)
        {
            arr[index++]=nums2[j++];
        }
        //finding median
        if((n+m)%2==1)
            return (double)arr[(n+m)/2];
        else
        {
            int d=(n+m)/2;
            int e=(n+m)/2-1;
            return (double)(arr[d]+arr[e])/2;
        }
    }
}