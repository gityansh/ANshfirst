package arrays;

public class longestSubStr {
    public  static int longeststr(String str){
        int [] chars = new int[128];
        int right = 0;
        int left = 0;
        int res = 0;
        while(right<str.length()){
            char r = str.charAt(right);
            chars[r]++;
            while(chars[r]>1){
                char x = str.charAt(left);
                chars[x]--;
                left++;
            }
            res = Math.max(res, right-left+1);
            right++;
        }
        return res;
    }    
    public static void main(String[] args) {
        String str = "abcabaab";
        System.out.println(longeststr(str));
    }
}
