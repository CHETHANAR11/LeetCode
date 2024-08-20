class Solution {
    public boolean stoneGame(int[] piles) {
        List<Integer> li=new ArrayList<>();
        int l=piles.length;
        for(int i:piles){
            li.add(i);
        }
        int a=0,b=0;
        boolean A=true,B=false;
        int i=0;
        while(li.size()>=1){
            if(li.get(i)<=li.get(li.size()-1) ){
                if(A==true){
                a+=li.get(li.size()-1);
                li.remove(li.size()-1);
                A=false;
                B=true;
                }
                else{
                  b+=li.get(i);
                li.remove(i);
                   B=false;
                    A=true;
                }
            }
            else if(li.get(i)>li.get(li.size()-1)){
                 if(A==true){
                a+=li.get(i);
                li.remove(i);
                     A=false;
                     B=true;
                 }
                else{
                    b+=li.get(li.size()-1);
                    li.remove(li.size()-1);
                    B=false;
                    A=true;
                }
            }
        }
        if(a>b){
            return true;
        }
        return false;
    }
}