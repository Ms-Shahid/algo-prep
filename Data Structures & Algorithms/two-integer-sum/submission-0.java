class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++ ){

            int compliment = target - nums[i];
            if(!map.containsKey(compliment)){
                map.put( nums[i], i);
            }else{
                return new int[]{ map.get(compliment), i };
            }

        }

        return new int[]{-1, -1};

    }
}
