public class StringDemo {
    public static void main(String [] args){
        String str = "Susan";
        System.out.println(str.substring(0)); //Susan
        System.out.println(str.substring(3)); //an
        System.out.println(str.substring(0,3)); //Sus
        System.out.println(str.charAt(2)); //s
        System.out.println(str.replace("s", "j")); //Sujan
        System.out.println(str.replaceFirst("san","dah")); //Sudah

        String str1 = "Hello";
        String str2 = "World";
        String S1;
        S1= str1 +" "+ str2;

        System.out.println(S1);
    }
}