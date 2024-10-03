import java.util.*;

class fibonacci{
    void mul(int n ){
        int j = n-2 , a = 0 , b = 1 , c ;
        System.out.print(a+"\t"+b+"\t");
        for (int i = 0; i < j; i++) {
            c= a+b ;
            a=b;
            b=c;
            System.out.print(c+"\t");
        }
    }
}


class fib{
    public static void main(String[] args) {
        System.out.println("Enter the number for the loops :");
        Scanner k = new Scanner(System.in);
        int b = k.nextInt();
        if(b>2) {
            fibonacci j = new fibonacci();
            j.mul(b);
        }
        else{
            if(b==1)
                System.out.println("0");
            else
                System.out.println("0\t1");
        }
    }
}