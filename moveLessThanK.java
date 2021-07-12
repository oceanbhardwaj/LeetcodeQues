 public static int minSwap (int arr[], int n, int k) {
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            count++;
        }
        for(int i=0;i<=n-count;i++)
        { int c=0;
            for(int j=0;j<count;j++)
            {
                if(arr[i+j]<=k)
                c++;
            }
            min=Math.min(count-c,min);
        }
        return min;
    }
    
    
}
////////////////////////////////////////////
public static int minSwap (int arr[], int n, int k) {
        int min=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            count++;
        }
        int c=0;
        
        for(int i=0;i<count;i++)
        {
            if(arr[i]>k)
            c++;
        }
        min=Math.min(min,c);
        for(int i=count;i<n;i++)
        {
            if(arr[i-count]>k)
            c--;
            if(arr[i]>k)
            c++;
            min=Math.min(min,c);
        }
        return min;
    }
    
    
}
