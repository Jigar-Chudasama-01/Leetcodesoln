import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzbuzz(15));
    }
    // Fizz Buzz easy;
    static List<String> fizzbuzz(int n){
        ArrayList<String> str  = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3==0 && i% 5==0 ){
                str.add("FizzBuzz");
            } else if (i % 3==0) {
                str.add("Fizz");
            }
            else if (i % 5==0) {
                str.add("Buzz");
            } else{
                str.add("\""+i+"\"");
            }
        }
        return  str;
    }
}
