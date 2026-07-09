package Day_14;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {

        String str = "swiss";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {

            if (map.get(ch) == 1) {
                System.out.println("First non-repeated character: " + ch);
                break;
            }
        }
    }
}