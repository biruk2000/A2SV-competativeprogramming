// How many numbers are smaller than the current numbers
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count =0;
        int[] newArray = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            for(int j=0; j< nums.length; j++){
                if(num > nums[j]){
                    count++;
                }
            }
            newArray[i] = count;
            count = 0;
        }
        
        return newArray;
    }
}
