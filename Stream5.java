import java.util.*;
import java.util.stream.IntStream;

class Stream5{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number ");
      int n=sc.nextInt();
       System.out.println(n+" is "+isPrime(n));
    }

    public static boolean isPrime(int n){
        // boolean isDivisible=false;
        // for(int i=2;i<=n/2;i++){
        //     if(n%i==0){
        //         isDivisible=true;
        //         break;
        //     }
        // }
        // return n>1 && !isDivisible;

        return n>1 && IntStream.range(2,n/2).noneMatch(i ->n%i==0);       
    }
}