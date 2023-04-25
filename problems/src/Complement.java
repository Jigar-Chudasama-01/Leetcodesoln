public class Complement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    //Number Complement easy;
    static int findComplement(int num) {
        int base = 1, ans = 0;
        while (num > 0) {
            int c = (num & 1)^1;
            num = num >> 1;
            ans = ans + base * c;
            base = base * 2;
        }
        return ans;
    }
}
