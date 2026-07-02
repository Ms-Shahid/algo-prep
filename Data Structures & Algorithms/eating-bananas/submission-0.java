class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1, high = 0;
        int n = piles.length;

        for(int pile : piles) high = Math.max( high, pile);

        int possibleAns = high;
        while( low <= high ){

            int eatingSpeed = low + ( high - low)/2;

            if(possibleToFinish(piles, h, eatingSpeed)){

                high = eatingSpeed - 1;
                possibleAns = eatingSpeed;
            }else{
                low = eatingSpeed + 1;
            }
            
        }

        return possibleAns;

    }
    
    public boolean possibleToFinish(int[] piles, int hour, int eatingSpeed){
        
        if (eatingSpeed == 0) return false;
        long totalHoursNeeded = 0;
        
        for(int pile : piles){
            totalHoursNeeded += (pile + eatingSpeed - 1L) / eatingSpeed;
            //maxHour += pile / eatingSpeed;   
        }
        
        if( totalHoursNeeded > hour ) return false;
        return true;
    }
}