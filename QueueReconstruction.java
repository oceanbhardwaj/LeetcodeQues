class Solution {
    public int[][] reconstructQueue(int[][] people) {
        ArrayList<int[]> a=new ArrayList<>();
        Comparator co=new Comparator<int[]>()
        {
            public int compare(int a[],int b[])
            {
                if(a[0]==b[0])
                    return a[1]-b[1];
                return b[0]-a[0];
            }
        };
        Arrays.sort(people,co);
        for(int a1[]:people)
        {
            a.add(a1[1],a1);
        }
      return a.toArray(new int[people.length][2]);
    }
}