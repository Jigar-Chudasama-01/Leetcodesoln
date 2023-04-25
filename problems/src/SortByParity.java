
import java.util.Arrays;

public class SortByParity {

    public static void main(String[] args) {
        int [] array = {0,1};
        System.out.println(Arrays.toString(sortbyparity(array)));
    }
    // Sort Array By Parity easy;
    static int [] sortbyparity(int [] nums){
        int [] arr = new int[nums.length];
        int j=0;
        for (int num : nums) {
            if (num % 2 == 0) {
                arr[j++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 != 0) {
                arr[j++] = num;
            }
        }
        return arr;
    }
    }