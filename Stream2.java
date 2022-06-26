//program for updating the marks of student by 5 marks.

import java.util.*;
import java.util.stream.*;
public class Stream2{
      public static void main(String args[]){
        ArrayList<Integer>oldMarks=new ArrayList<Integer>();
        oldMarks.add(58);
        oldMarks.add(82);
        oldMarks.add(81);
        oldMarks.add(73);
        oldMarks.add(66);
        oldMarks.add(70);
        System.out.println(oldMarks);

        List<Integer>updateMarks=oldMarks.stream().map(i->i+5).collect(Collectors.toList());
       
        System.out.println(updateMarks);
        
      }
      
 
}