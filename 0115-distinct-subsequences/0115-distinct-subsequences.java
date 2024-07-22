class Solution {
    public int numDistinct(String S, String T) {
        int[][] mem=new int[T.length()+1][S.length()+1];

        for(int i=0;i<S.length();i++){
            mem[0][i]=1;
        }

        for(int i=0;i<T.length();i++){
            for(int j=0;j<S.length();j++){
                if(S.charAt(j)==T.charAt(i)){
                    mem[i+1][j+1]=mem[i+1][j]+mem[i][j];
                    }
                else{
                    mem[i+1][j+1]=mem[i+1][j];
                }
            }
        }
        return mem[T.length()][S.length()];
    }
}