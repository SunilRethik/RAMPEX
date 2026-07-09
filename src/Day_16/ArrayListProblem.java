package Day_16;

import java.util.ArrayList;

public class ArrayListProblem {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Charlie");

        System.out.println(names);

        names.remove("Charlie");

        System.out.println(names);
    }
}