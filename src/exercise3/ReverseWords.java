public class ReverseWords {

    public static void main(String[] args) {

        String sentence = "To be or not to be.";

        // Split the sentence into an array of words.
        String[] words = sentence.split(" ");

        // Reverse the letters of every word.
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }

        // Join the reversed words back into a sentence.
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = result + words[i];
            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        System.out.println("Original : " + sentence);
        System.out.println("Reversed : " + result);
    }

    // Reverses the letters of one word and keeps the
    // punctuation mark (e.g. the full stop) at the end.
    public static String reverseWord(String word) {

        String body = word;
        char punctuation = 0;
        char last = word.charAt(word.length() - 1);

        if (!Character.isLetter(last)) {
            punctuation = last;
            body = word.substring(0, word.length() - 1);
        }

        String reversed = "";
        for (int i = body.length() - 1; i >= 0; i--) {
            reversed = reversed + body.charAt(i);
        }

        if (punctuation != 0) {
            reversed = reversed + punctuation;
        }
        return reversed;
    }
}
