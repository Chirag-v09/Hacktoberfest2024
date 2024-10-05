//singe inheritence
import java.util.Scanner;
class Area
{
    int l,b;
    Area(int l1,int b1)
    {
        this.l=l1;
        this.b=b1;
    }
    void are()
    {
        System.out.println("Area:"+(l*b));
    }
}
class Area1 extends Area
{
    int h;
    Area1(int l,int b,int h1)
    {
        super(l,b);
        this.h=h1;
    }
    void vol()
    {
        System.out.println("volume:"+(l*b*h));
    }
}
class singleInheritArea
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int l=sc.nextInt();
        System.out.println("Enter the breadth");
        int b=sc.nextInt();
        System.out.println("Enter the height");
        int h=sc.nextInt();
        Area1 ob=new Area1(l,b,h);
        ob.are();
        ob.vol();
    }
}