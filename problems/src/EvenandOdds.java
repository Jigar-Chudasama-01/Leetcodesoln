import java.util.Arrays;

public class EvenandOdds {
    public static void main(String[] args) {
        int n =17;
        System.out.println(Arrays.toString(evenOddBit(n)));
    }
    //Number of Even and Odd Bits easy;
    static int[] evenOddBit(int n) {
        int index=0,even=0,odd=0;
        while(n>0){
            int c= n & 1;
            n = n >>1;
            if(c==1 && index % 2==0){
                even++;
            }
            else if(c==1 && index % 2 !=0){
                odd++;
            }
            index++;
        }
        int [] arr ={0,0};arr[0]=even;arr[1]=odd;
        return arr;
    }
}
