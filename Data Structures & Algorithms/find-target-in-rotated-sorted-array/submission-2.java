class Solution {
    public int search(int[] nums, int target) {
        
        //RSA -> SA(0, minIndex-1) + SA(minIndex, n-1)

        int ans = -1;

        int findMinIndex = findMinIndex(nums);
        //search in SA(0, minIndex-1)
        ans = binarySearch(nums, target, 0, findMinIndex - 1);

        if( ans == -1 )
            //search in SA(0, minIndex-1)
            return binarySearch(nums, target, findMinIndex, nums.length-1);

        return ans;

    }

    public int findMinIndex(int[] nums){

        int low = 0, high = nums.length - 1;

        while( low < high ){

            int mid = low + ( high - low)/2;
            //search in right 
            if(nums[mid] > nums[high] ) low = mid + 1;

            else high = mid;
        }
        return high;
    }

    public int binarySearch(int[] nums, int target, int startIndex, int endIndex ){

        while( startIndex <= endIndex ){
            int mid = startIndex + (endIndex-startIndex)/2;

            if( nums[mid] == target ) return mid;
            else if( nums[mid] < target ) startIndex = mid + 1;
            else endIndex = mid - 1;
        }

        return -1;
    }
}
