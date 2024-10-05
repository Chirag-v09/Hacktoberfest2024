import java.util.* ;

class factorial{
    public static void main(String[] args) {
        System.out.println("Enter the Number you want to find the factorial of : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() ;
        Fact ans = new Fact() ;
        ans.getres(num);
    }
}

class Fact{
    void getres(int n){
        int j = n,mul = 1 ;
        for (int i = 1; i <= j; i++) {
            mul = mul*i ;
        }
        System.out.println("The factorial of "+j+" is "+ mul);
    }
}