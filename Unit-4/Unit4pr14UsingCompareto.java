public class Unit4pr14UsingCompareto {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "apple";
        String s3 = "APPLE";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s3));
    }
}
