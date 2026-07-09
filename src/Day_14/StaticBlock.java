package Day_14;

public class StaticBlock {
    static{
        System.out.println("static block called");
    }
    public static void main(String [] args){
        System.out.println("main method called");
        bookTicket();
    }
    public static void bookTicket(){
        System.out.println("ticket booked");
    }
}
