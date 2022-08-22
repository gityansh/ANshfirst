package arrays;

public class StrCharCount {

    static void appr_1(String str){
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 0;
            while (i <= n && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count += 1;

            }
            System.out.println(str.charAt(i) + count);
        }
    }



    public static void main(String[] args) {
        String str = "aaaabbbbccccccddd";
        appr_1(str);

        
    }
}
