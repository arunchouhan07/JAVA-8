import java.util.*;
interface A{
    void check(int num,String name);
}
class Demo{
    public static void main(String[] args) {
        A obj = (num,name)->
        {
            System.out.println(name);
        };
        obj.check(7,"Arun Chouhan");
    }
}

// Output :- Arun Chouhan