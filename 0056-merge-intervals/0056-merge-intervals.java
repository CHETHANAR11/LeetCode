class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        Arrays.sort(intervals,(a,b)->{ return a[0]-b[0];});
        ArrayList<int[]>al=new ArrayList<>();
        for(int i[]:intervals)
        {
            if(al.size()==0)
                al.add(i);
            else
            {
                int []last=al.get(al.size()-1);
                if(i[0]>last[1])
                    al.add(i);
                else 
                    last[1]=Math.max(last[1],i[1]);
            }
        }
        return al.toArray(new int[al.size()][2]);
    }
}