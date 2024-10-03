import java.util.*;
import  java.lang.Math.sqrt();
class primefind{
    void getres(int a, int b){
        System.out.println("Prime Numers in rnage "+a+" to "+b+" are : ");
        for (int i = a; i < sqrt(b); i++) {
            int c = 0 ;
            for (int j = 2; j < i; j++) {
                if(i%j==0)
                    c+=1;
            }
            if(c==0){
                System.out.print(i+"\t");
            }
        }
    }
}

class prime{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a , b ;
        System.out.println("Enter the range you want to find the prime numbers in  : ");
        a = sc.nextInt();
        b = sc.nextInt();
        primefind pc = new primefind() ;
        pc.getres(a,b);
        System.out.println("Complete ..............");
    }
}