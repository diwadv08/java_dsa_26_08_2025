package Basics.New_02_09;

public class StringMethods {
    public static void main(String[] args) {
        // String str = "Hello";
        // str = new String("Hi");
        // System.out.println(str);
        // System.out.println(str.length());     // 16 → counts characters
        // System.out.println(str.charAt(0));
        String s1 = "Aello";
        String s2 = "aello";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));          
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));       

    }
}
