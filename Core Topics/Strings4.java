// String Methods

public class Strings4 {
    public static void main(String[] args)
    {
        String str="Satyam";
        String str2="";
        String str3 = "        Singh";
        System.out.println(str.charAt(3)); // return character that is on index 3
        System.out.println(str.contains("am")); // return boolean whether the string contains or not
        System.out.println(str.contentEquals("Satyam")); // return boolean whether the string euqal or not
        System.out.println(str.indexOf('y')); // return index of character if not present then return -1
        System.out.println(str.isEmpty()); // return boolean whether the string is empty or not
        System.out.println(str2.isEmpty());
        System.out.println(str.toLowerCase()); // return a lowercase of the string given
        System.out.println(str.toUpperCase()); // return the uppercase of the string given
        System.out.println(str3.trim());  // trim the given string
    }
}
