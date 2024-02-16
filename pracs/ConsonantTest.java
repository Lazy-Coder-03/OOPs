
public class ConsonantTest {
    public static String remConsonants(String str) {
        String res = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                res = res + ch;
            }
        }
        if(res.equals("")) {
            return "No Vowels";
        }
        return res;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over a lazy dog.";
        System.out.println(remConsonants(str));
    }
}
