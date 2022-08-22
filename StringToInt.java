package arrays;

public class StringToInt {
    static void stoi(String str){
        int n = str.length();
        int index  = 0;
        int sign = 1;
        int result = 0;
        while(index<n && str.charAt(index)== ' '){
            index++;
        }
        if(index<n && str.charAt(index)=='-'){
            sign = -1;
            index++;
        }
        else if(index<n && str.charAt(index)=='+'){
            sign = 1;
            index++;
        }
        while(index<n && Character.isDigit(str.charAt(index))){
            int digit = str.charAt(index) - '0';
            result = result *10 +digit;
            index++;
        }
        System.out.println(result*sign);
    }
    public static void main(String[] args) {
        String str = "  4312";
        stoi(str);
    }
}
