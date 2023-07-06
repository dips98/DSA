package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        // arr.add("HI"); You cant add we can make arraylist int staring char as we wanted else it can be accept any data type include array itself 
        arr.ensureCapacity(20);
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println(arr);
        System.out.println(arr.contains(3));
        System.out.println("index of number 3 is :"+arr.indexOf(3));
        System.out.println("Size of array :"+ arr.size());
        arr.trimToSize();
        System.out.println(arr.size());
        arr.clear();
        System.out.println(arr);

        List arr1 = new ArrayList();
        arr1.add("All");
        arr1.add(80);
        System.out.println(arr1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(arr1);

        System.out.println(result);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sorting the array in ascending order
        Arrays.sort(nums);

        // Logic to find triplets that sum up to zero
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                // Skipping duplicates
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skipping duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Moving pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
