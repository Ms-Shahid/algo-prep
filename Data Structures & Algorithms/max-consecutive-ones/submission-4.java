class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes = 0;
        int n = nums.length;

        int left = 0, right = 1;
        if( n == 1 && nums[left] == 0 ) return 0;
        if( n == 1 && nums[left] == 1 ) return 1;

        // while( right < n ){

        //     if( nums[left] == 1 && nums[right] == 1 ) right++;
        //     else if( nums[right] == 0 ){
        //         maxOnes = Math.max( maxOnes, right - left );
        //         left = right + 1;
        //         right = left + 1;
        //     }
        //     else{
        //         left++;
        //     }
        // }
        // maxOnes = Math.max( maxOnes, right - left );

        int currentOnes = 0;
        for(int i = 0; i < n; i++ ){
            if( nums[i] == 1 ) currentOnes++;
            else if( nums[i] == 0 ) currentOnes = 0;

            maxOnes = Math.max(maxOnes, currentOnes);
        }
        return maxOnes;
        
    }
}