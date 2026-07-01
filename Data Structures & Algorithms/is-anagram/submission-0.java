class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] freqS = new int[26];
        int[] freqT = new int[26];

        int i = 0;
        for(char ch : s.toCharArray()){
            freqS[ch - 'a']++;
        }

        i = 0;
        for(char ch : t.toCharArray()){
            freqT[ch - 'a']++;
        }

        for(int k = 0; k < freqS.length; k++ ){
            System.out.print( freqS[k] + " ");
        }

        System.out.println();
        for(int k = 0; k < freqT.length; k++ ){
            System.out.print( freqT[k] + " ");
        }

        System.out.println();

        for(int k = 0; k < freqS.length; k++ ){
            if( freqS[k] != freqT[k] ) return false;
        }

        return true;
        

    }
}