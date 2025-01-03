public int removeDuplicates(int[] nums) {
    int startPointer = 0;
    for( int i =0;i<nums.length;i++){
        if(nums[startPointer]!= nums[i]){
            nums[startPoniter + 1] = nums[i]; //copying the index of the unique element
            startPointer++; //increasing the startPointer to the next index 
        }
    }
    return startPointer + 1; // returning the unique elements 
}