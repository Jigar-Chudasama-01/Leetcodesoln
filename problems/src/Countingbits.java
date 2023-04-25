import java.util.Arrays;

public class Countingbits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(8)));
    }
    // Counting Bits easy;
    static int[] countBits(int n) {//complexity : O(n*log(n))
        int [] arr = new int[n+1];
        for(int i=0; i<n+1; i++){
            int c=i;
            while(c!=0){
                int x= c & 1;
                c = c>>1;
                arr[i]=arr[i]+x;
            }
        }//yet solve this with complexity of O(n);
        return arr;
    }

}
