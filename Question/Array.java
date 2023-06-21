package Question;

import java.util.Arrays;

class Array {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[i] = i;
                    res[j] = j;
                }
            }
        }
        int count = 0;
        for (int element : res) {
            if (element != -1) {
                if (element != 0 && count == 0) {
                    continue;
                }
                count++;
            }
        }

        // Create a new array with the appropriate size
        int[] newArray = new int[count];

        // Copy the non-zero elements to the new array
        int newIndex = 0;
        for (int element : res) {
            if (element != -1) {
                if (newArray[newIndex] != 0) {
                    continue;
                }
                newArray[newIndex] = element;
                newIndex++;
            }
        }
        return newArray;

        // int lastIndex = res.length - 1;

        // // Find the index of the last non-zero element
        // while (lastIndex >= 0 && res[lastIndex] == 0) {
        // lastIndex--;
        // }

        // // Create a new array with the appropriate size
        // int[] trimmedArray = new int[lastIndex + 1];

        // // Copy the non-zero elements to the new array
        // System.arraycopy(res, 0, trimmedArray, 0, lastIndex + 1);
        // return trimmedArray;
    }
}