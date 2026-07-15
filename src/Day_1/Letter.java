package rampexday1;

class Letter {
    public static void main(String[] args) {
        char letter = 'a';

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is an uppercase");
        } else if (letter >= 'a' && letter <= 'z') {
            System.out.println(letter + " is a lowercase");
        } else if (letter >= '0' && letter <= '9') {
            System.out.println(letter + " is a digit");
        } else {
            System.out.println(letter + " is a special character");
        }
    }
}