package Day_30;
import java.sql.*;
import java.util.Scanner;

public class InsertBooking {

    public static void main(String[] args) throws Exception {

        Student s1 = new Student();
        s1.InsertStudent();

    }
}
class Student{
    int id ;
    String name;
    int age;
    String dept;


    void  InsertStudent  ()throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter your name : ");

        String name = sc.nextLine();

        System.out.println("Enter your age : ");

        int age = sc.nextInt();


        System.out.println("Enter your id : ");

        int id = sc.nextInt();

        sc.nextLine();

        System.out.println(" Enter your dept : ");

        String dept = sc.nextLine();

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student",
                "root", "root");


        String sql = "INSERT INTO student " +
                "(id  ,name ,age  ,department ) " +
                "VALUES (?, ?, ?, ?)";


        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setString(4,dept);

        int rows = ps.executeUpdate();

        System.out.println(rows + " row(s) inserted");

        ps.close();
        con.close();

    }
}