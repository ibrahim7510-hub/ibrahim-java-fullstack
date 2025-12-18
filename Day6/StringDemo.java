public class StringDemo {
    public static void main(String[] args) {
        String s1 = " ";
        System.out.println(s1.isBlank());

        //isEmpty()
        //The isEmpty() method checks if the string has a length of 0.
        String s2 = "";
        System.out.println(s2.isEmpty());

        //equals()
        String ss1 = "abc";
        String ss2 = "Abc";
        System.out.println(ss1.equals(ss2)); // false

        //equalsIgnoreCase()
        String str1 = "abc";
        String strs2 = "Abc";
        System.out.println(str1.equalsIgnoreCase(strs2)); // true

        //compareTo()
        //it returns zero if all the character are same,else return negative if s1<s2,else return postive s1>s2.
        String sstr1 ="Abc";
        String str2 = "abc";
        System.out.println(sstr1.compareTo(str2));

        //compareToIgnorecase()
        String strs1="Abc";
        String sstr2="abc";
        System.out.println(strs1.compareToIgnoreCase(sstr2));

        //startswith()
        String a ="Hello World";
        System.out.println(a.startsWith("H"));

        //endswith
        String b = "Programming";
        System.out.println(b.endsWith("orld"));
    }
}