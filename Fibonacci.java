package day03;

/**
 * @ClassName Fibonacci
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/1 9:01]
 * @Version 1.0
 **/

public class Fibonacci {
    public int testFibonacci(int n){
        if(n==1||n==2){
            return 1;
        }
         int p=1;
         int q=1;
         int result=0;
           while(n!=2) {
               n--;
           result=p+q;
           q=p;
           p=result;
           }
           return result;
    }

    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        System.out.println(f.testFibonacci(2));
        System.out.println(f.testFibonacci(7));

    }
}
