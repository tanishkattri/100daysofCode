class Solution {
    public int numberOfMatches(int n) {
        int t = 0;
        if(n==1){
            return 0;
        }else{
            while(n>1){
            if(n%2==0){
            t = t+ (n/2);
            n = n/2;
            }else {
                t = t+((n-1)/2);
                n = (n/2)+1;
            }
        }
        return t;
        }
    }
}
