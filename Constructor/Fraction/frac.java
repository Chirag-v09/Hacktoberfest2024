import java.util.* ;

class fraction{
    double n , d ;
    fraction(double num,double den){
        n = num ;
        d = den ;
    }
    double fra(){
        double ans ;
        ans = n/d ;
        return(ans);
    }
}

class frac{
    public static void main(String[] args) {
        fraction f1 = new fraction(12.0,4.0);
        double a = f1.fra() ;
        System.out.println(a);
    }
}