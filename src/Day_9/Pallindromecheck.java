package Day_9;


import java.util.Arrays;

 class Pallindromecheck {

     public static void main(String[] args) {

         String s = "appa";

         char [] ch = new char[s.length()];

         int n = s.length();
         for (int i = 0; i < s.length(); i++) {

             ch [i] = s.charAt(n-1-i);
         }

         String rev = "";

         for (int i = 0;i < ch.length;i++) {

             rev=rev+ch[i];
         }

         if (s.equals(rev)) {

             System.out.println("Palindrome");
         }
         else {
             System.out.println("Not Palindrome");
         }
         System.out.println(Arrays.toString(ch));
     }
}
