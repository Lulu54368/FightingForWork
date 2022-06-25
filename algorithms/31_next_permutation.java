class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i >= 0 && i < nums.length){
            if(nums[i] >= nums[i+1]) i--;
            else break;
        }
        int j = nums.length -1;
        if(i >= 0){
            while(j >= 0 && j < nums.length){
                System.out.println(j);
                if(nums[j] <= nums[i]) j --;
                else break;
            }
            //swap i and j
            int temp = nums[i];
            nums[i] = nums[j];
       
            nums[j] = temp;
        }
        
        
       
        //reverse after i+1
        int start = i+1;
        int end = nums.length-1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
    }
}
