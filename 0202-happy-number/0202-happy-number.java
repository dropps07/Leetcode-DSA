class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast=n;
        do {
            slow= findSqrt(slow);
            fast = findSqrt(findSqrt(fast));
        }while(slow != fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    public int findSqrt(int number){
        int ans =0;
        while(number>0){
            int rem = number % 10;
            ans += rem * rem;
            number/=10;
        }
        return ans;
    }
}