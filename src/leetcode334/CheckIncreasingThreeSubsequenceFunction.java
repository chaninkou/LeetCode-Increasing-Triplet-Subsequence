package leetcode334;

public class CheckIncreasingThreeSubsequenceFunction {
	public boolean increasingTriplet(int[] nums) {
		// This will store the min and second min number
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        for(int num : nums){
        	// Should get the min first or else this is not going to work
            if(num <= min){
                min = num;
            } else if (num <= secondMin){ // If min is already found, set second min now
                secondMin = num;
            } else if (num > secondMin) { // Could just put "else"
            	// Current is bigger than min and second min
                return true;
            }
        }
        
        // If its here, that means no increasing was found
        return false;
    }
}
