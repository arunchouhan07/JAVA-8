// program for printing the number whose start with 1;
import java.util.*;
public class Stream6{
    public static void main(String args[]){

        List<Integer>number=Arrays.asList(10,12,20,18,19,33);

        number.stream().map(s-> s+"").filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}