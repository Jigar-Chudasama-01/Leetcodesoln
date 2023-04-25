import java.util.Arrays;

public class SortSentense {
    public static void main(String[] args) {
        String s1 = "is2 this1 sentence4 a3";
        sortsentense(s1);
        //Sort The Sentence easy;
    }

    static void sortsentense(String s) {

            String [] s1 = s.split(" "); // splits string s from space and stores it in String Array s1
        String [] str = new String[s1.length];// if you initialize Array of string without values then default value of each index is NULL

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length(); j++) {
                char ch = s1[i].charAt(j);
                if (Character.isDigit(ch)) {
                    int digit= Character.getNumericValue(ch);
                    str[digit-1]=s1[i].replace(String.valueOf(digit),"");//when digit is found it is replaced with nothing.
                }
            }//you cannot put values at random indices in StringBuilder without giving values first. you'll have to give values from index 0 first.
        }
        System.out.println("\""+String.join(" ",str)+"\"");//we join array of string by using .join
    }
}
