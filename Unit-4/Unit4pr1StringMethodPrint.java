public class Unit4pr1StringMethodPrint {
    public static void main(String[] args) {
        String str1 = "Namaste       ";
        String str2 = "Hello";
        String str3 = "Heyy";
        
        int length = str1.length();
        System.out.println("This is length of string: " + length);

        char ch = str2.charAt(4);
        System.out.println("This is choosen char: " + ch);

        String sub = str1.substring(3, 6);
        System.out.println("This is substring: " + sub);

        String lower = str3.toLowerCase();
        System.out.println("This is Print in lowercase: " + lower);

        String upper = str1.toUpperCase();
        System.out.println("This is Print in Uppercase: " + upper);
        
        String trrim = str1.trim();
        System.out.println("This is remove Space: " + trrim);
        
        boolean equall = str2.equals(str3);
        System.out.println("This is Equality: " + equall);
        
        String cat = str2.concat(str3);
        System.out.println("This is Add to String: " + cat);

    }
}