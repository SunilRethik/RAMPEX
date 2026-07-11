package Day_16.Class_Task;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(5);
        list.add(7);
        list.add(5);
        list.add(null);

        System.out.println("Before removing: " + list);

        list.remove(null);

        System.out.println("After removing: " + list);

        System.out.println("First index of 5: " + list.indexOf(5));

        System.out.println("Last index of 5: " + list.lastIndexOf(5));
    }
}