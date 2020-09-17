class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        while(i<s1.length() && arr1[i]==arr2[i])
        {
            i++;
        }
       int index1=0;
        int flag=0;
        if(arr1[i]>arr2[i])
        {
            index1=i;
            flag=1;
        }
        else
        {
            index1=i;
            flag=2;
        }
        for(int j=index1;j<s1.length();j++)
        {
            if(flag==1)
            {
                if(arr1[j]<arr2[j])
                    return false;
            }
            if(flag==2)
            {
                if(arr1[j]>arr2[j])
                    return false;
            }
            
        }
        return true;
    }
}