//const overloading
class parent
{
    int x=2,y=3,c;
    void sum()
    {
        c=x+y;
        System.out.println(c);
    }
    void display()
    {
        System.out.println(c);
    }
}
class child extends parent
{
    int mult;
    void cal()
    {
        int x1=4,y1=5;
        mult=x1*y1;
    }
    void display()
    {
        System.out.println(mult);
    }
}
class methodoverriding
{
    public static void main(String args[])
    {
        child d=new child();
        d.sum();
        d.cal();
        d.display();
    }
}