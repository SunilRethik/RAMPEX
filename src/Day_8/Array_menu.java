package Day_8;

import java.util.Arrays;

public class Array_menu {
    static void main(String[] args) {
        String [] menu = {"veg","non-veg","sweets","beverages"};
        String [] m1 = new String[menu.length];
        for(int i=0 ; i<menu.length ;i++){
            m1 [i]=menu[menu.length-1-i];
        }

        System.out.println(Arrays.toString(m1));
    }
}
