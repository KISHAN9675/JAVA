public class Unit4pr11Acronym {
    public static void main(String[] args) {
        String str = "Central Bureau of Investigation";
        String[] words = str.split(" ");
        String acronym = "";
        for(int i=0; i<4; i++){
            char ch = words[i].charAt(0);
            if(ch>='A' && ch<='Z'){
                acronym = acronym+ch;
            }
        }
        System.out.println(acronym);
    }    
}
