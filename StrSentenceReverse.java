package arrays;

public class StrSentenceReverse {
    public static void main(String[] args) {
        String str = "The Sky is Blue";
        String WordArr[] = str.split(" ");
        int n = WordArr.length;
        String sentence = "";
        for(int i=n-1;i>=0;i--){
            if(WordArr[i].equals("")){
                continue;
            }
            sentence += WordArr[i]+" ";

        }
        sentence = sentence.trim();
        System.out.println(sentence);

    }
}
