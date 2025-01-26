class Solution {
    public int[] countBits(int n) {
        int [] cp = new int[n+1];
        int sub = 1;
        for(int i=1;i<=n;i++){
            if(sub*2==i){
                sub = i;

            }
            cp[i] = cp[i-sub]+1;
        }
        return cp;
    }
}