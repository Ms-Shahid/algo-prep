class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++ ){

            int minLengthOfWord = Math.min(prefix.length(), strs[i].length());
            int commonItr = 0;
            
            while( commonItr < minLengthOfWord ){
                if( prefix.charAt(commonItr) != strs[i].charAt(commonItr) ) break;

                commonItr++;
            }

            prefix = prefix.substring(0, commonItr);
        }

        return prefix;
    }
}