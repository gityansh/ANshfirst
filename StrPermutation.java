package arrays;

public class StrPermutation {
    static int factorial(int n){
        int val = 1;
        for(int i=2;i<=n;i++){
            val *= i;
        }
        return val;
    }
    static void Solution(String str){
        int n = str.length();
        int f = factorial(n);
        for(int i=0;i<f;i++){
            StringBuilder sb = new StringBuilder();
            int temp = i;
            for(int j=n;j>=1;j--){
                int q = temp/j;
                int r =temp % j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }
}
