public class PowerofThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1162261467));
        System.out.println(isPowerOffour(16));
    }
    static boolean isPowerOfThree(int n) {
        if (n==1 || n==-1){
            return true;
        }
        if (n%3 !=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
static boolean isPowerOffour(int n) {
    if (n==1 || n==-1){
        return true;
    }
    if (n%4 !=0){
        return false;
    }
    return isPowerOffour(n/4);
}
}
