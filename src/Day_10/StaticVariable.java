package Day_10;

public class StaticVariable {
    public static void main(String[] args) {

        AiDsStudent s1 = new AiDsStudent();
        AiDsStudent s2 = new AiDsStudent();

        s1.name = "Sunil";
        s2.name = "Rethik";

        s1.id = 1;
        s2.id = 2;

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(AiDsStudent.dept);

        AiDsStudent.readDeptName();

        s1.doHackathon();
    }
}

class AiDsStudent {

    String name;
    int id;

    static String dept = "Ai&Ds";

    public static void readDeptName() {
        System.out.println(dept);
    }

    public void doHackathon() {
        System.out.println("Doing Hackathon");
        System.out.println(name);
        System.out.println(dept);
    }
}