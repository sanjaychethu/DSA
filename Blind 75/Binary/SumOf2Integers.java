class Solution {
    public int getSum(int a, int b) {

        while(b!=0){
            int carry = (a&b)<<1;
            int ans = a^b;
            a=ans;
            b=carry;
        }
        return a;
        
    }
}