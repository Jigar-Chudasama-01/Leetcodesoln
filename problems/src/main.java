import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9};
        System.out.println(Arrays.toString(Plusone(arr)));
    }
//Plus one easy;
    static int[] Plusone(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return  digits;
        }
        int count =0;
        for (int j=0; j<digits.length-1;j++){
            if (digits[j]==9){
                count++;
            }
        }
        int i =digits.length-1;
        while(i>=0 && count!=digits.length-1){
            if (digits[i]==9){
                digits[i]=0;
            }
            if (digits[i-1]!=9){
                digits[i-1]++;
                break;
            }
            i--;
        }
        if (count==digits.length-1){
            int [] arr = new int[digits.length+1];
            arr[0]=1;
            return  arr;
        }
        return digits;
    }
}
