package arrays;

public class AnagramString {
    static boolean app_1(String s1 , String s2){
        int count[] = new int[256];
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<s2.length();i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "SILENT";
        String s2 = "LISTEN";
        System.out.println(app_1(s1, s2));
    }
}
