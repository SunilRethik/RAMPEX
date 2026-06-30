package Day_9;

public class FindLengthofArray {
        public static void main(String[] args) {

            String[] names = {"ramya", "kishore", "satheesh", "sunilrethik"};

            String largest = names[0];

            for (int i = 1; i < names.length; i++) {
                if (names[i].length() > largest.length()) {
                    largest = names[i];
                }
            }

            System.out.println("Largest Name: " + largest);
            System.out.println("Length: " + largest.length());
        }
    }
