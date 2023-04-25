public class StepsToReduceto0 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    //Number of Steps to Reduce a Number to Zero easy;
    static int numberOfSteps(int num) {
    return helper(num,0);
    }
    private static int helper(int num, int i) {
        if (num ==0){
            return i;
        }
        if (num % 2 ==0){
            return helper(num/2, i+1);
        }
         else {
            return helper(num-1,i+1);
        }
    }
}