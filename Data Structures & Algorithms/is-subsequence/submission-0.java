class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int pointerS = 0, pointerT = 0;

        while( pointerS < s.length() && pointerT < t.length() ){

            if( s.charAt(pointerS) != t.charAt(pointerT) ){
                pointerT++;
            }else{
                pointerS++;
                pointerT++;
            }
        }

        return pointerS == s.length();
    }
}