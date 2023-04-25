public class PowerofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(513));
    }
    // power of two easy; here 0 is edge case;
    static boolean isPowerOfTwo(int n) {
        int count=0;boolean r = true;
        if (n==0){return false;}
        while(n!=0){
            int c= n & 1;
            n = n>>1;
            count+=c;
            if (count>1){
                return false;
            }
        }
        return r;
    }
}
