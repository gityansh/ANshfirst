package arrays;

public class PatternMatchslidingWindow {
    static void appr_1(String s1,String pattern){
        for(int i=0;i<s1.length()-pattern.length();i++){
            int j;
            for(j=0;j<pattern.length();j++){
                if(pattern.charAt(j) != s1.charAt(i+j)){
                    break;
                }
            }
            if(j==pattern.length()){
                System.out.println("Pattern Found : "+i);
            }
            
        }
        
    }
    public static void main(String[] args) {
        String s1 = "ABCBAABCDA";
        String pattern = "ABC";
        appr_1(s1, pattern);
    }
}
