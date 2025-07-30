public class Unit4pr2CountVowelConstDigits {
    public static void main(String[] args) {
        String str = "Java 101 is cool";
        str = str.toLowerCase();
        int vowel = 0, consonant = 0, digit = 0, space = 0;
        int i;
        for (i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }

            else if (ch >= '0' && ch <= '9') {
                digit++;
            } else if (ch == ' ') {
                space++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonant: " + consonant);
        System.out.println("Digit: " + digit);
        System.out.println("Space: " + space);
    }

}
