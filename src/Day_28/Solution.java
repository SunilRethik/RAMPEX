package Day_28;

class Sw {




}



public class Solution {
    public static int maxVowels(String s, int k) {
        // maxVowels("abciiidef",3)
//  create required variables  maxvc, vc n
//  create nested to count the substring
// count the vowel for each inner loop
// after the inner loop process , compare with maxvc
//update it

        int maxvc =0;
        int vc=0;

        int n = s.length();

        for(int i =0; i<=n-k;i++){

// for each sub string


            for(int j =i;j<=i+2;j++){

                // each iteration checks whether char is vowel
                // and count s it

                if(s.charAt(j)=='a'||s.charAt(j)=='e'|| s.charAt(j)=='i'|| s.charAt(j)=='o'|| s.charAt(j)=='u')
                {

                    vc++;
                }
            }
            if(vc > maxvc )
            {
                maxvc =vc;}


            vc =0;

        }

        return maxvc;



    }


    public static void main(String[] args) {
        System.out.println(maxVowels("abciidef",3));
    }


}