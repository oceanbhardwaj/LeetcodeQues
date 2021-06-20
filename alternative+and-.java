class Solution {
    void rearrange(int arr[], int n) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            pos.add(arr[i]);
            else
            neg.add(arr[i]);
        }
        //System.out.println(pos);
        //System.out.println(neg);
        boolean flag=true;
        int i=0;
        int j=0;
        int index=0;
        while(i<pos.size() && j<neg.size())
        {
            if(flag)
            arr[index++]=pos.get(i++);
            else
            arr[index++]=neg.get(j++);
            flag=!flag;
            
        }
        while(i<pos.size())
        {
            arr[index++]=pos.get(i++);
        }
        
        while(j<neg.size())
        {
            arr[index++]=neg.get(j++);
        }
    }
}