//print only those element which are divible by 2.

import java.util.*;
import java.util.stream.*;
public class Stream1{
      public static void main(String args[]){
        ArrayList<Integer>l=new ArrayList<Integer>();
        l.add(5);
        l.add(8);
        l.add(11);
        l.add(18);
        l.add(22);
        l.add(25);
        System.out.println(l);

        List<Integer>l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
       
        System.out.println(l2);
        
      }
      
 
}