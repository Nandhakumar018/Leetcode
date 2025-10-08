class Solution {
    public int fib(int n) {
        int previous=0;
        int current=1;
        int sum=0,last=0;
        for(int i=0;i<=n;i++){
            last=previous;
            sum=previous+current;
            previous=current;
            current=sum;
        }
        return last;
    }
}