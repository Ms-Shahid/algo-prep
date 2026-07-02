class Solution {
    public int findMin(int[] nums) {
    
        int low = 0, high = nums.length - 1;

        while( low < high ){

            int mid = low + ( high - low)/2;

            //search min in right side
            if( nums[mid] > nums[high] ) low = mid + 1;
            
            //search min in left side
            else high = mid; 
        }
        return nums[high];
    }
}
