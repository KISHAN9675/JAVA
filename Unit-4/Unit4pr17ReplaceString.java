public class Unit4pr17ReplaceString {
    public static void main(String[] args) {
        String str = "java is a primium language java invented java symbol is cup and plate AEIOU ";
        String str2 = str.replaceAll("[aeiouAEIOU]","$"); str.replaceAll("[j]","%");
        System.out.println(str2);

    }
    
}
