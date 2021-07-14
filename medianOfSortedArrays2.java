class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int mid=m+n;
        int i=0;int j=0;
        if(mid%2==1)//odd
        {
            int m1=0;
            for(int c=0;c<=mid/2;c++)
            {
                if(i!=n && j!=m)
                {
                    m1=(nums1[i]<nums2[j])?nums1[i++]:nums2[j++];
                }
                else if(i<n)
                {
                    m1=nums1[i++];
                }
                else if(j<m)
                {
                    m1=nums2[j++];
                }
            }
            return (double)m1;
        }
        else
        {
             int m1=0;
            int m2=0;
            for(int c=0;c<=mid/2;c++)
            { m2=m1;
                if(i!=n && j!=m)
                {
                    m1=(nums1[i]<nums2[j])?nums1[i++]:nums2[j++];
                }
                else if(i<n)
                {
                    m1=nums1[i++];
                }
                else if(j<m)
                {
                    m1=nums2[j++];
                }
            }
            System.out.println(m1+"----------"+m2);
            return (double)(m1+m2)/2;
        }
    }
}
///////////////////////////////////////////
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        int n1=nums1.length;
        int n2=nums2.length;
        int low=0;
        int high=n1;
        while(low<=high)
        {
        int cut1=(low+high)/2;
            int cut2=(n1+n2+1)/2-cut1;
            int l1=(cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
                int l2=(cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
                int r1=(cut1==n1)?Integer.MAX_VALUE:nums1[cut1];
                int r2=(cut2==n2)?Integer.MAX_VALUE:nums2[cut2];
            if(l1<=r2 && l2<=r1)
            {
                if((n1+n2)%2==1)
                    return (double)Math.max(l1,l2);
                else
                    return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2;
            }
            else if(l1>r2)
            {
                high=cut1-1;
            }
            else
                low=cut1+1;
        
        
        }
        return 0.0;
    }
}