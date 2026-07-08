class Solution {
    public int countSeniors(String[] details) {
        
        int passengersAbove60 = 0;

        for(int i = 0; i < details.length; i++ ){

            String extractAge = details[i].substring(11, 13);
            System.out.println(" age -> " + extractAge);
            int age = Integer.parseInt(extractAge);

            if( age > 60 ) passengersAbove60++;
        }
        return passengersAbove60;
    }
}