public class CountTo0 {
    public static void main(String[] args) {
        System.out.println(countOperations(2,3));
    }
    //Count Operations to Obtain Zero easy;
    static int  countOperations(int num1, int num2) {
        return helper(num1,num2,0);
    }
    private static int helper(int num1, int num2, int c) {
        if(num1==0 || num2==0){
            return c;
        }
        if(num1>num2){
            return helper(num1-num2,num2,c+1);
        }
        else{
            return helper(num1,num2-num1,c+1);
        }
    }
}