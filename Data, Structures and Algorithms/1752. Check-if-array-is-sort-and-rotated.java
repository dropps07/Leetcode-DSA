class solutions{
    public boolean check(int[] nums){
        int n = nums.length;
        int counter = 0;
        for(int i = 1;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){ //(i-1)formula to rotate arr to rigth by 1 where %n avoids it to get back to its initial index position
                counter ++; //checks to number of rotations
            }
        }return counter <= 1; //returns true if number of rotations is less than or equal to 1 else false.
    }
}
