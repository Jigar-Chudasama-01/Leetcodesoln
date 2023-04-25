public class Leetcode_money {
    public static void main(String[] args) {
        System.out.println(money(20));
    }
    //Calculate money in LeetCode bank easy;
    static int money(int n){
        int ans=0,s=0;
        for (int i = 1; i <= n;) {
            ans = ans + (s + i);
            if (i % 7 ==0){
                i=1;s++;n=n-7;
            }else {
                i++;
            }
        }
        return ans;
    }
}
