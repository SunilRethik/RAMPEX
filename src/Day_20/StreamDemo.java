package Day_20;
import java.util.Arrays;
 class StreamDemo {
     public static void main(String[] args) {
         int [] arr = {7,2,6,9,5,3,8,4,1,10};
         Arrays.stream(arr).filter((n)->n%2!=0).sorted().forEach(n->System.out.println(n));
     }

 }


 //_____________________for even________________________




//    public static void main(String[] args){
//
//        int [] arr = {7,2,6,9,5,3,8,4,1,10};
//
//        Arrays.stream(arr).filter((n)->n%2==0).sorted().forEach(n->System.out.println(n));
//    }
//}
