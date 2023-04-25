public class XorNumbers {
    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
    }
    //XOR Operation in an Array easy;
    static int  xorOperation(int n, int start) {
        int [] arr = new int[n];int ans=0;
        for(int i=0;i<n;i++){
            arr[i]= start + 2 * i;
        }
        for(int i=0; i<n;i++){
            ans ^=arr[i];
        }
        return ans;
    }
}
