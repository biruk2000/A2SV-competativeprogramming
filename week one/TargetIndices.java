// Find Target indices after sorting array
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int temp = 0;
        // first sort the numbers
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                  temp= nums[j];
                  nums[j]= nums[j+1];
                  nums[j+1]=temp; 
            }
        }
    }
    
    List<Integer> list = new ArrayList<>();
   for(int i=0; i<nums.length; i++){
       if(nums[i] == target){
           list.add(i);
       }
   }
    return list;
}
}
