class Solution {
    public void rotate(int[] nums, int k){
        int n = nums.length;
        int k = k%n; // ensruing k<=n so that it doesnt get back to where it was 
        int[] temp = new int[n]; // creating a new array of length n
        for(int i =0;i<n;i++){
            temp[(i+k)%n]= nums[i]; // (i+k)formula to rotate the array to right where %n avoids it to get back to its initial index position
        }
        for(int i =0;i<n;i++){
            nums[i] = temp[i];
        }

    }
}