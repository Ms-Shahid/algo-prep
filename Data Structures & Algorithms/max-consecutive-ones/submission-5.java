class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes = 0;
        int n = nums.length;

        int left = 0, right = 1;
        if( n == 1 && nums[left] == 0 ) return 0;
        if( n == 1 && nums[left] == 1 ) return 1;

        int currentOnes = 0;
        for(int i = 0; i < n; i++ ){
            if( nums[i] == 1 ) currentOnes++;
            else if( nums[i] == 0 ) currentOnes = 0;

            maxOnes = Math.max(maxOnes, currentOnes);
        }
        return maxOnes;
        
    }
}