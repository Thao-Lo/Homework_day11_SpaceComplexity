package be5_day13_DSA_sort_ArrayList;

import java.util.ArrayList;

public class MinGap {
	public static void main(String[] args) {

		int[] array = { 1, 2, 5, 6, 4, 5, 1, 8, 9, 3, 6 };

		int minGap = findMinGap(array);
		System.out.println();
		System.out.println("Min Gap = " + minGap);
	}

	//TIME COMPLEXITY: On^2
	//SPACE COMPLEXITY: On^2
	
	public static int findMinGap(int[] array) {
		ArrayList<Integer> gaps = new ArrayList<Integer>();
		int minGap = 0;

		for (int i = 0; i < array.length; i++) {
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					int gap = j - i;
					gaps.add(gap);
					break;
				}
			}
		}
		
		minGap = gaps.get(0);
		for (int k = 1; k < gaps.size(); k++) {

			if (minGap >= gaps.get(k)) {
				minGap = gaps.get(k);
			}
		}
		return minGap;
	}
}
