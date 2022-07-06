//Program for finding the 3rd Higest value from the Array/List using Stream API(java 8);
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ThirdHigest{
    public static void main(String args[]){
        Integer arr[]={100,4,1,21,92,24,82};

        List<Integer>list=Arrays.asList(arr);

        list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
    }
}