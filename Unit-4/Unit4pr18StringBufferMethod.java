public class Unit4pr18StringBufferMethod {

    
    public static void main(String[] args) {
        //using Append(String.str):-
        StringBuffer str = new StringBuffer("Hello");
        str.append(" World");
        System.out.println(str); 
        str.append(" java");
        System.out.println(str);

        //using insert(int offset,String str):-
        StringBuffer s = new StringBuffer("Helloworld");
        s.insert(5," ");
        System.out.println(s);  
        
        //using replace(int start,int end,String str):-
        StringBuffer str2 = new StringBuffer("java World");
        str2.replace(0, 5, "Python ");
        System.out.println(str2);

        //using delete(int start,int end);
        StringBuffer str3 = new StringBuffer("java is my programming");
        str3.delete(8, 10);
        System.out.println(str3);

        //using reverse():-
        StringBuffer str4 = new StringBuffer("Apple");
        str4.reverse();
        System.out.println(str4);

        //using capicity():-
        StringBuffer str5 = new StringBuffer("hello");
        str5.capacity();
        System.out.println(str5.capacity());

        
    }  
}