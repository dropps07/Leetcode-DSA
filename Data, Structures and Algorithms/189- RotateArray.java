class solution{
public void rotate(int k, int [] nums){

int temp[] = new int[nums.length];
int k = k% nums.length;
for(int i =0;i<nums.length;i++){
temp[(k+i)%nums.length]= nums[i];
}
for(int i =0;i< nums.length;i++){
nums[i] = temo[i];
}
}
}
