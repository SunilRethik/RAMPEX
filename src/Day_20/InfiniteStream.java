package Day_20;
import java.util.stream.Stream;
 class InfiniteStream {
    public static void main(String[] args) {

        Stream.iterate(0,n->n+2).limit(10).forEach(n->System.out.println(n));


    }
}
