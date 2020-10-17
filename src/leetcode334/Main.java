package leetcode334;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {6,7,3,4,5};
		
		System.out.println("input: " + Arrays.toString(nums));
		
		CheckIncreasingThreeSubsequenceFunction solution = new CheckIncreasingThreeSubsequenceFunction();
		
		System.out.println("Solution: " + solution.increasingTriplet(nums));
	}
}
