 public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int gap=n+m;
       for(gap=NextGap(gap);gap>0;gap=NextGap(gap))
        {  int j;
        int i;
            //step1--------------first array swaps
            for( i=0;i+gap<n;i++)
            {
                if(arr1[i]>arr1[i+gap])
                 {
                     long temp=arr1[i];
                     arr1[i]=arr1[i+gap];
                     arr1[i+gap]=temp;
                 }
            }
            //step2--------------first and second array swap
            for(j=(gap>n)?(gap-n):0;i<n && j<m;i++,j++)
            {
                if(arr1[i]>arr2[j])
               {
                   long temp=arr1[i];
                   arr1[i]=arr2[j];
                   arr2[j]=temp;
               }
            }
            //step3----------------second array swaps
            if(j<m){
            for(j=0;j+gap<m  ;j++)
            {
                if(arr2[j]>arr2[j+gap])
                {
                    long temp=arr2[j];
                    arr2[j]=arr2[j+gap];
                    arr2[j+gap]=temp;
                }
            }
            }
            
            
        }
    }
    
    public static int NextGap(int gap)
    {
        if(gap<=1)
        return 0;
        return gap/2+gap%2;
    }
    
}
