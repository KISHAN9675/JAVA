public class Unit4pr20ChainedOpration {

    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Welcome");
        str1.append(" to java");
        str1.insert(6," programming");
        str1.replace(0, 4, " Python");
        str1.reverse();
        System.out.println(str1);
    }
}