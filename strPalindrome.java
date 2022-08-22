package arrays;

public class strPalindrome {
    static void isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(str.equals(sb.toString()));
    }
    static void isPalindrome_2(String str){
        int begin = 0;
        int end = str.length()-1;
        while(begin<end){
            if(str.charAt(begin)!=str.charAt(end)){
                System.out.println(false);
            }
            begin++;
            end--;

        }
        System.out.println(true);

    }
    public static void main(String[] args) {
        String str = "NOON";
        isPalindrome(str);
        isPalindrome_2(str);
    }
}
