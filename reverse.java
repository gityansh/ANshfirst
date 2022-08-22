package arrays;

public class reverse {
    static String reverseWords(String Words) {
        int i = 0;
        int j = Words.length() - 1;
        char WordArr[] = Words.toCharArray();
        char temp;
        while (i < j) {
            temp = WordArr[i];
            WordArr[i] = WordArr[j];
            WordArr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(WordArr);

    }

    public static void main(String[] args) {
        String str = "HEY HOW ARE YOU";
        //String rev = reverseWords(str);
        //System.out.println(rev);
        String Word[]=str.split(" ");
        String sentence = "";
        for(String word :Word){
            sentence += reverseWords(word)+" ";

        }
        System.out.println(sentence);

    }
}
