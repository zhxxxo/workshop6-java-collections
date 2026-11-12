public class Decoder {

    // Key table: the cipher letter and the plain letter it
    // decodes to, e.g. 'a' -> 'c', 'b' -> 'r'.
    // More pairs can be added to these two arrays.
    private static final String CIPHER = "abefglqst";
    private static final String PLAIN = "craviejkl";

    public static void main(String[] args) {

        String codedMessage = "G tgsl Qefe.";

        System.out.println("Coded   : " + codedMessage);
        System.out.println("Decoded : " + decode(codedMessage));
    }

    public static String decode(String message) {

        String decoded = "";

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            char lower = Character.toLowerCase(c);
            int index = CIPHER.indexOf(lower);

            if (index == -1) {
                // Spaces, punctuation and letters that are
                // not in the key table stay unchanged.
                decoded = decoded + c;
            } else {
                char plain = PLAIN.charAt(index);
                if (Character.isUpperCase(c)) {
                    plain = Character.toUpperCase(plain);
                }
                decoded = decoded + plain;
            }
        }
        return decoded;
    }
}
