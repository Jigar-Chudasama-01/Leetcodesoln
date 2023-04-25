
import java.util.*;//to use all util packages

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3}; int target=2;
        System.out.println(targetIndices(nums,target));
    }
//    Find Target Indices easy;
    static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> myList = new ArrayList<Integer>();
        int s= 0; int e=nums.length-1;
        while(s<=e){
            int m = s + (e - s) / 2;
            if (target == nums[m]) {//in some cases difference of if,else-if,break matters;
                myList.add(m);
                int left = m-1;
                while(left>=s && nums[left]==target){
                    myList.add(left--);
                }
                int right = m+1;
                while(right<=e && nums[right]==target){
                    myList.add(right++);
                }
                break;//here break condition is necessary;
            }
            else if(target>nums[m]){
                s= m +1;
            }
            else {
                e=m-1;
            }
        }
        Collections.sort(myList);//to sort list
        return myList;
    }
}
