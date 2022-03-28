package HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;

public class Target {
    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            myList.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++){
            int x = target - nums[i];
            if (myList.contains(x)) {
                if(myList.indexOf(x)!=i){
                    return new int[]{i, myList.indexOf(x)};
                }
                else if (myList.lastIndexOf(x)!=i){
                    return new int[]{i, myList.lastIndexOf(x)};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] y = twoSum(new int[]{9, 5, 8, 3, 7}, 10);
        for (int i = 0; i < y.length; i++){
            System.out.println(y[i]);
        }
    }
}
