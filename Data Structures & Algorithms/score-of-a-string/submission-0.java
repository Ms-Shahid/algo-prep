class Solution {
    public int scoreOfString(String s) {
        
        int absSum = 0;

        for(int i = 0; i < s.length()-1; i++ ){

            absSum += Math.abs( s.charAt(i) - s.charAt(i+1)); 
            
        }

        return absSum;
    }
}