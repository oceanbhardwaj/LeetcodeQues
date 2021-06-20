class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> a=new ArrayList<>();
        int carry=1;
        int sum=0;
        for(int i=digits.length-1;i>=0;i--)
        {   sum=(digits[i]+carry)%10;
            
            a.add(sum);
            carry=(digits[i]+carry)/10;
        }
        
        if(carry!=0)
            a.add(carry);
        int index=0;
        int arr[]=new int[a.size()];
        for(int i=a.size()-1;i>=0;i--)
        {
             arr[index++]=a.get(i);
        
        }
        return arr;
    }
}
////////////////////////////
int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {digits[i]++;
             return digits;}
            digits[i]=0;
            
            
        }
        int d[]=new int[n+1];
        d[0]=1;
        return d;